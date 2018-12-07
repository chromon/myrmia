package com.myrmia.controller.admin;

import com.myrmia.dto.InstallDTO;
import com.myrmia.model.OptionsDO;
import com.myrmia.model.UsersDO;
import com.myrmia.service.OptionsService;
import com.myrmia.service.UsersService;
import com.myrmia.utils.security.PasswordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * admin login controller
 * Created by Ellery on 2018/11/1.
 */
@Controller("adminLoginController")
@RequestMapping("/admin")
public class LoginController {

    private OptionsService optionsService;
    private UsersService usersService;

    @Resource
    private PasswordUtils passwordUtils;

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String login(Model model) {

        // 查询网址名称
        OptionsDO optionsDO = optionsService.queryOptionsByName("siteTitle");
        model.addAttribute("siteTitle", optionsDO.getOptionsValue());

        return "admin/login";
    }

    @RequestMapping(value="/do_login", method = RequestMethod.POST)
    public String doLogin(@ModelAttribute InstallDTO installDTO, Model model) {

        // 校验用户信息
        UsersDO usersDO = usersService.queryUsersByName(installDTO.getAdminUser());

        if (usersDO != null) {
            String signInPassword = installDTO.getAdminPwd();

            String salt = usersDO.getSalt();
            String password = passwordUtils.checkPassword(salt, signInPassword);
            if (password.equals(usersDO.getPassword())) {
                // 用户名密码正确

                // 保持 cookie
                if (installDTO.getRememberMe() != null) {
                    System.out.println("rememberMe == true");
                }

                // admin 首页信息

                return "admin/index";
            }
        }

        // 查询网址名称
        OptionsDO optionsDO = optionsService.queryOptionsByName("siteTitle");
        model.addAttribute("siteTitle", optionsDO.getOptionsValue());
        // 错误信息
        model.addAttribute("errorInfo", "用户名或密码错误");

        return "admin/login";
    }

    @Autowired
    public void setOptionsService(OptionsService optionsService) {
        this.optionsService = optionsService;
    }

    @Autowired
    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }
}
