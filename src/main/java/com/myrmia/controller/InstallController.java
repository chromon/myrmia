package com.myrmia.controller;

import com.myrmia.utils.config.ProjectConfig;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.File;
import java.io.IOException;

/**
 * users controller
 * Created by Ellery on 2018/10/13.
 */
@Controller
public class InstallController implements BaseController {

    @RequestMapping(value="/install", method = RequestMethod.GET)
    public String install(Model model) {

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

        model.addAttribute("isInstalled", existInstall && !allowReinstall);

        return "theme/" + THEME + "/install";
    }

}
