package com.yanfu.dao;

import com.yanfu.model.base.BaseInfo;
import org.apache.ibatis.annotations.Param;

/**
 * @Authour Zhang Yanfu
 * @Date 2018/7/28.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
public interface CharityDao {
    BaseInfo findCharity();
}
