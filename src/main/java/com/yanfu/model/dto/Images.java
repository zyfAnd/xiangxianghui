package com.yanfu.model.dto;

import com.yanfu.model.base.BaseModel;

/**
 * @Authour Zhang Yanfu
 * @Date 2018/7/29.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
public class Images extends BaseModel {
    private String imageUrl ;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Images(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
