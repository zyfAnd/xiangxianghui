package com.yanfu.controller;

import com.yanfu.model.base.BaseResult;
import com.yanfu.service.ActivityService;
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
@RequestMapping(value = "/activity")
public class ActivityController {
    @Autowired
    private ActivityService activitySrevice;
    @ApiOperation(value = "获取赶集活动")
    @RequestMapping(value = "/getActivities",method = RequestMethod.GET)
    public BaseResult getActivities(){
        BaseResult baseResult  = new BaseResult();
        baseResult.setData(activitySrevice.getActivities());
        return  baseResult;
    }
}
