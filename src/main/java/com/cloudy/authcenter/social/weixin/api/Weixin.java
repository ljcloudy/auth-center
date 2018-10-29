package com.cloudy.authcenter.social.weixin.api;

/**
 * Created by ljy_cloudy on 2018/10/14.
 */
public interface Weixin {

    WeixinUserInfo getUserInfo(String openId);
}
