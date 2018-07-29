package com.yanfu.service.impl;

import com.yanfu.dao.ActivityDao;
import com.yanfu.model.base.BaseInfo;
import com.yanfu.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Authour Zhang Yanfu
 * @Date 2018/7/28.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    ActivityDao activityDao;
    @Override
    public BaseInfo getActivities() {
        return activityDao.getaActivities();
    }
}
