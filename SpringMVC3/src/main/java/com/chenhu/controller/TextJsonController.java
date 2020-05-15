package com.chenhu.controller;

import com.chenhu.pojo.User;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("text")
public class TextJsonController {

    //ajax请求这个方法，返回json字符串数据
    @RequestMapping("/textJson")
    public @ResponseBody
    Map<String,String> textJaon(){
        System.out.println("textJson方法执行了");

        Map<String,String> map = new HashMap<String, String>() ;
        map.put("user1","1");
        map.put("user2","2");
        map.put("user3","3");
        map.put("user4","4");
        return map;
    }
    //文件上传
    @RequestMapping("/fileuploads")
    public String fileuploads(HttpServletRequest request) throws Exception {
        System.out.println("fileupload方法执行了");
        //使用fileupload组件完成文件上传
        //上传的位置
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        //判断该路径是否存在
        File file = new File(path);
        if(!file.exists()){
            //创建该文件夹
            file.mkdirs();
        }
        //解析request对象，获取文件上传项
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload fileUpload = new ServletFileUpload(factory);
        //解析request
       List<FileItem> fileItems =  fileUpload.parseRequest(request);

        for (FileItem item:fileItems) {
            //进行判断（是否为上传文件项）
            if(item.isFormField()){
                //普通表单项
            }else {
                //文件项
                String pathname = item.getName();//获取上传文件名字
                item.write( new File(path,pathname));//完成文件上传
                item.delete();//删除文件
            }
        }

        return "success";
    }
}
