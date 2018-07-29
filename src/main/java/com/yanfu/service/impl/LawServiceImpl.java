package com.yanfu.service.impl;

import com.yanfu.dao.LawDao;
import com.yanfu.model.base.BaseInfo;
import com.yanfu.service.LawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Authour Zhang Yanfu
 * @Date 2018/7/28.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
@Service
public class LawServiceImpl implements LawService {
    @Autowired
    private LawDao lawDao;
    @Override
    public BaseInfo getLawInfo() {
        return lawDao.getLawInfo();
    }
}
