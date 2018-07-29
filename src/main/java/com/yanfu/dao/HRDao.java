package com.yanfu.dao;

import com.yanfu.model.base.BaseInfo;
import com.yanfu.model.entity.Recruit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Authour Zhang Yanfu
 * @Date 2018/7/28.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
public interface HRDao {
    List<BaseInfo> findAll();
}
