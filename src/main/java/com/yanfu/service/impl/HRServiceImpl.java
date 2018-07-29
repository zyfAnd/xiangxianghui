package com.yanfu.service.impl;

import com.yanfu.dao.HRDao;
import com.yanfu.model.base.BaseInfo;
import com.yanfu.model.entity.Recruit;
import com.yanfu.service.HRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Authour Zhang Yanfu
 * @Date 2018/7/28.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
@Service
public class HRServiceImpl implements HRService {

    @Autowired
    private HRDao hrDao;
    @Override
    public List<BaseInfo> findAll() {
        return hrDao.findAll();
    }
}
