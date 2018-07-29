package com.yanfu.controller;

import com.yanfu.model.base.BaseResult;
import com.yanfu.service.LawService;
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
@RequestMapping(value = "/law")
public class LawController {
    @Autowired
    private LawService lawService;
    @ApiOperation(value = "获取法律咨询信息")
    @RequestMapping(value = "getLawInfo",method = RequestMethod.GET)
    public BaseResult getLawInfo(){
        BaseResult baseResult = new BaseResult();
        baseResult.setData(lawService.getLawInfo());
        return baseResult;
    }

}
