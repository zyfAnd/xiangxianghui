package com.yanfu.controller;

import com.yanfu.model.base.BaseInfo;
import com.yanfu.model.base.BaseResult;
import com.yanfu.service.InvestmentService;
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
@RequestMapping(value = "/investment")
public class InvestmentController {
    @Autowired
    InvestmentService investmentService;
    @ApiOperation(value = "获取招商引资的信息")
    @RequestMapping(value = "/getInvestment",method = RequestMethod.GET)
    public BaseResult getInvesment(){
        BaseResult baseResult = new BaseResult();
        baseResult.setData(investmentService.getInvestment());
        return baseResult;
    }
}
