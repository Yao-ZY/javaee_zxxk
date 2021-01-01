package com.nuc.zxxk.controller;

import com.nuc.zxxk.enums.ResponseEnum;
import com.nuc.zxxk.utils.QiniuUpload;
import com.nuc.zxxk.vo.ResponseVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {
    @PostMapping("/upload/img")
//    @ResponseBody
    public ResponseVo upload(@RequestParam("file") MultipartFile file){
        if(file.isEmpty()){
            return ResponseVo.error(ResponseEnum.FILE_ERROE);
        }
        try {
            String picUrl = QiniuUpload.updateFile(file);
            return ResponseVo.successByMsg(picUrl);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseVo.error(ResponseEnum.FILE_ERROE);
        }
    }
}
