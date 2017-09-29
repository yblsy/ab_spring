package lc.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 刘晨
 * @create 2017-09-26 15:36
 * To change this template use File | Settings | Editor | File and Code Templates.
 **/
@Controller
@RequestMapping("fileUpload")
public class FileUploadController {

    private Logger log = LoggerFactory.getLogger(FileUploadController.class);

    @RequestMapping(value = "fileUpload")
    public String fileUpload(HttpServletRequest requst,MultipartFile multipartFile){
        log.info("123123122");
        return "multipartfile/multipartFile";
    }
}
