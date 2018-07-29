package com.yanfu.controller;

import com.yanfu.model.base.BaseInfo;
import com.yanfu.model.base.BaseResult;
import com.yanfu.service.CharityService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Authour Zhang Yanfu
 * @Date 2018/7/28.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
@RestController
@RequestMapping(value = "/charity")
public class CharityController {
    @Autowired
    private CharityService charityService;
    @ApiOperation(value = "获取慈善信息",notes = "")
    @RequestMapping(value = "/getCharity", method = RequestMethod.GET)
    public BaseResult getCharity(){
       BaseResult baseResult =  new BaseResult();
       baseResult.setData(charityService.findCharity());
       return baseResult;
    }
}
