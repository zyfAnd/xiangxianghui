package com.yanfu.controller;

import com.yanfu.model.base.BaseResult;
import com.yanfu.model.dto.Images;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

/**
 * @Authour Zhang Yanfu
 * @Date 2018/7/29.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
@RestController
@RequestMapping(value = "/common")
public class CommController {
    String[] imgs =  {"","","",""};
    @ApiOperation(value = "获取banner图片")
    @RequestMapping(value =  "/getBannerImgs",method = RequestMethod.GET)
    public BaseResult getBannerImgs(){
        BaseResult baseResult =  new BaseResult();
        Images images =  new Images("https://www.baidy.com");
        baseResult.setData(images);
        return baseResult;
    }
}
