package com.yanfu.service.impl;

import com.yanfu.dao.CarDao;
import com.yanfu.model.base.BaseInfo;
import com.yanfu.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Authour Zhang Yanfu
 * @Date 2018/7/28.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDao carDao;
    @Override
    public BaseInfo getCarInfo() {
        return carDao.getCarInfo();
    }
}
