package com.yanfu.controller;

import com.yanfu.model.base.BaseInfo;
import com.yanfu.model.base.BaseResult;
import com.yanfu.service.HRService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Authour Zhang Yanfu
 * @Date 2018/7/25.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
@RestController
@RequestMapping(value = "/hr")
public class HRController {
    @Autowired
    private HRService hrService;
    @ApiOperation(value = "获取人力资源信息", notes = "")
    @RequestMapping(value = "/getHRInformation",method = RequestMethod.GET)
    public BaseResult getHRInformation(){
        BaseInfo baseInfo =  new BaseInfo();
        hrService.findAll();
        BaseResult baseResult = new BaseResult();
        baseResult.setData(hrService.findAll());
        return baseResult;
    }
}
