package com.myrmia.controller.admin;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myrmia.utils.file.FileUtils;
import com.myrmia.utils.info.Information;
import org.apache.logging.log4j.util.StringMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

/**
 * admin article controller
 * Created by Ellery on 2018/11/1.
 */
@Controller("adminPublishController")
@RequestMapping("/admin")
public class PublishController {

    @RequestMapping(value="/publish", method = RequestMethod.GET)
    public String test(Model model) {
        model.addAttribute("active", "publish");
        return "admin/publish";
    }

    @RequestMapping(value = "/imgUpload", method = RequestMethod.POST)
    @ResponseBody
    public Object uploadImage(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) {
        File destFile = null;
        FileOutputStream fos = null;
        if (!file.isEmpty()) {
            try {
                String path = request.getSession().getServletContext().getRealPath("/resources/upload");
                FileUtils.isDirectory(path);
                System.out.println("path:" + path);

                String fileName = UUID.randomUUID().toString().replace("-", "") + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
                System.out.println(fileName);

                destFile = new File(path + File.separator + fileName);
//                FileUtils.copyInputStreamToFile(file.getInputStream(), destFile); //复制临时文件到指定目录
//                file.transferTo(destFile);

                System.out.println(path + "/" + fileName);

//                fos = new FileOutputStream(destFile);
                file.transferTo(destFile);

//                StringMap stringMap = QiniuUtil.upload(fileName, path + "/" + fileName);

                // 返回消息
//                Information info = new Information();
//                info.setInfoType("success");
//                info.setInfoContent("install info saved success." + destFile.getAbsolutePath());

                // json 格式化
                ObjectMapper mapper = new ObjectMapper();
                System.out.println(File.separator + "upload" + File.separator + fileName);
                return mapper.writeValueAsString(File.separator + "resources"+ File.separator + "upload" + File.separator + fileName);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
//                try {
//                    if (fos != null) {
//                        fos.close();
//                    }
//                } catch (IOException ioe) {
//                    System.out.println("Error while closing stream: " + ioe);
//                }
            }
        }
        return null;
    }
}
