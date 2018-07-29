package com.yanfu.controller;

import com.yanfu.model.base.BaseResult;
import com.yanfu.service.CarService;
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
@RequestMapping(value = "/car")
public class CarController {
    @Autowired
    private CarService carService;
    @ApiOperation(value = "获取汽车信息")
    @RequestMapping(value = "getCarInfo",method = RequestMethod.GET)
    public BaseResult getCarInfo(){
        BaseResult baseResult = new BaseResult();
        baseResult.setData(carService.getCarInfo());
        return baseResult;
    }
}
