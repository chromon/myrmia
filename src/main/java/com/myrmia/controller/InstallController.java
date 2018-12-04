package com.myrmia.controller;

import com.myrmia.dto.InstallDTO;
import com.myrmia.model.UsersDO;
import com.myrmia.utils.config.ProjectConfig;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.File;

/**
 * users controller
 * Created by Ellery on 2018/10/13.
 */
@Controller
public class InstallController implements BaseController {

    @RequestMapping(value="/install", method = RequestMethod.GET)
    public String install(Model model) {
        // 是否已安装
        model.addAttribute("isInstalled", isRepeatInstall());
        return "theme/" + THEME + "/install";
    }


    @RequestMapping(value="/save_install_info", method = RequestMethod.POST)
    public String saveInstallInfo(@ModelAttribute InstallDTO installDTO, Model model) {

        // 保存用户信息

        // 保存选项信息

        model.addAttribute("isInstalled", false);

        return "theme/" + THEME + "/install";
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
}
