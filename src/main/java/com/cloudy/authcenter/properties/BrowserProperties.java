package com.cloudy.authcenter.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by ljy_cloudy on 2018/10/7.
 */
@ConfigurationProperties(prefix = "cloudy.security")
public class BrowserProperties {

    private String loginPage = "/imooc-signIn.html";

    private String signUpUrl = "/imooc-signUp.html";

    private int rememberMeSeconds = 3600;

    public String getSignUpUrl() {
        return signUpUrl;
    }

    public void setSignUpUrl(String signUpUrl) {
        this.signUpUrl = signUpUrl;
    }

    public int getRememberMeSeconds() {
        return rememberMeSeconds;
    }

    public void setRememberMeSeconds(int rememberMeSeconds) {
        this.rememberMeSeconds = rememberMeSeconds;
    }

    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }
}
