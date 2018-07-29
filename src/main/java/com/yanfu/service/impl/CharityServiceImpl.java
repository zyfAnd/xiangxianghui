package com.yanfu.service.impl;

import com.yanfu.dao.CharityDao;
import com.yanfu.model.base.BaseInfo;
import com.yanfu.service.CharityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Authour Zhang Yanfu
 * @Date 2018/7/28.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
@Service
public class CharityServiceImpl implements CharityService {
    @Autowired
    CharityDao charityDao;
    @Override
    public BaseInfo findCharity() {
        return charityDao.findCharity();
    }
}
