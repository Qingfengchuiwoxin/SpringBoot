package com.qfcwx.springbootfileupload.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: FileController
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/9 12:51
 * @Version 1.0
 **/
@RestController
public class FileController {

    private static final String FILE_PATH = "D:/idea_workspace/SpringBootDemo/SpringBoot/springboot-fileupload/src/main/resources/images/";


    @PostMapping(value = "/upload")
    public String upload(@RequestParam("file")MultipartFile file, HttpServletRequest request){

        String name = request.getParameter("name");
        System.out.println("用户名:"+name);

        //获取文件名
        String fileName = file.getOriginalFilename();
        System.out.println("上传的文件名:" + fileName);

        //获取文件的后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        //获取文件前缀
        String prefixName = fileName.substring(0, fileName.lastIndexOf("."));

        //上传文件后的名称
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");
        String date = dateFormat.format(new Date());

        fileName = prefixName + date + suffixName;
        File dest = new File(FILE_PATH + fileName);

        try {
            file.transferTo(dest);
            return name+"上传文件成功,上传后的文件名为:"+fileName;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败!";
    }
}
