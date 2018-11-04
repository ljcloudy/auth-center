package com.cloudy.authcenter.properties;


/**
 * Created by ljy_cloudy on 2018/10/14.
 */
public class WeixinProperties extends BaseSocialProperties {
    private String providerId = "weixin";

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }
}
