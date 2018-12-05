package com.myrmia.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myrmia.dto.InstallDTO;
import com.myrmia.model.OptionsDO;
import com.myrmia.model.UsersDO;
import com.myrmia.service.OptionsService;
import com.myrmia.service.UsersService;
import com.myrmia.utils.config.ProjectConfig;
import com.myrmia.utils.security.PasswordUtils;
import com.myrmia.utils.url.UrlUtils;
import com.myrmia.utils.info.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * users controller
 * Created by Ellery on 2018/10/13.
 */
@Controller
public class InstallController implements BaseController {

    @Resource
    private PasswordUtils passwordUtils;

    private UsersService usersService;
    private OptionsService optionsService;

    @RequestMapping(value="/install", method = RequestMethod.GET)
    public String install(Model model) {
        // 是否已安装
        model.addAttribute("isInstalled", isRepeatInstall());
        return "theme/" + THEME + "/install";
    }


    @RequestMapping(value="/save_install_info", method = RequestMethod.POST)
    @ResponseBody
    public String saveInstallInfo(@ModelAttribute InstallDTO installDTO,
                                  Model model) throws JsonProcessingException {

        // 保存用户信息
        UsersDO usersDO = new UsersDO();
        usersDO.setUsername(installDTO.getAdminUser());
        Map<String, String> passMap = passwordUtils.getEncryptPassword(
                installDTO.getAdminPwd());
        usersDO.setSalt(passMap.get("salt"));
        usersDO.setPassword(passMap.get("password"));
        usersDO.setEmail(installDTO.getAdminEmail());
        usersService.saveUsers(usersDO);

        // 保存选项信息
        String siteUrl = UrlUtils.buildURL(installDTO.getSiteURL());

        OptionsDO optionsDO = new OptionsDO();
        optionsDO.setOptionsName("siteUrl");
        optionsDO.setOptionsValue(siteUrl);
        optionsService.saveOptions(optionsDO);

        optionsDO.setOptionsName("siteTitle");
        optionsDO.setOptionsValue(installDTO.getSiteTitle());
        optionsService.saveOptions(optionsDO);

        // 根目录创建安装锁定文件
        File lockFile = new File(ProjectConfig.CLASSPATH + "install.lock");
        try {
            lockFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 返回消息
        Information info = new Information();
        info.setInfoType("success");
        info.setInfoContent("install info saved success.");

        // json 格式化
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(info);
    }

    /**
     * 是否重复安装
     * @return 安装信息
     */
    private boolean isRepeatInstall() {

        // 根目录创建安装锁定文件
        File lockFile = new File(ProjectConfig.CLASSPATH + "install.lock");
        // 是否已安装
        boolean existInstall = false;
        // 是否允许重复安装
        boolean allowReinstall = ProjectConfig.OPTION_ALLOW_INSTALL;

        // 安装锁定文件存在
        if (lockFile.exists()) {
            existInstall = true;
        }

        return existInstall && !allowReinstall;
    }

    @Autowired
    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }

    @Autowired
    public void setOptionsService(OptionsService optionsService) {
        this.optionsService = optionsService;
    }
}
