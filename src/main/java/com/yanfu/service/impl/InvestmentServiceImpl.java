package com.yanfu.service.impl;

import com.yanfu.dao.InvestmentDao;
import com.yanfu.model.base.BaseInfo;
import com.yanfu.service.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Authour Zhang Yanfu
 * @Date 2018/7/28.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
@Service
public class InvestmentServiceImpl implements InvestmentService {

    @Autowired
    private InvestmentDao investmentDao;
    @Override
    public BaseInfo getInvestment() {
        return investmentDao.getInvestment();
    }
}
