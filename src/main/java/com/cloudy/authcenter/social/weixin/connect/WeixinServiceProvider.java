package com.cloudy.authcenter.social.weixin.connect;


import com.cloudy.authcenter.social.weixin.api.Weixin;
import com.cloudy.authcenter.social.weixin.api.WeixinImpl;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;

/**
 * 微信的OAuth2流程处理器的提供器，共spring social的connect体系使用
 * Created by ljy_cloudy on 2018/10/14.
 */
public class WeixinServiceProvider extends AbstractOAuth2ServiceProvider<Weixin> {

    /**
     * 微信获取授权码的url
     */
    private static final String URL_AUTHORIZE = "https://open.weixin.qq.com/connect/qrconnect";
    /**
     * 微信获取accessToken的url
     */
    private static final String URL_ACCESS_TOKEN = "https://api.weixin.qq.com/sns/oauth2/access_token";


    /**
     *
     * @param appId
     * @param appsecret
     */
    public WeixinServiceProvider(String appId, String appsecret) {
        super(new WeixinOAuth2Template(appId,appsecret,URL_AUTHORIZE,URL_ACCESS_TOKEN));
    }

    @Override
    public Weixin getApi(String accessToken) {
        return new WeixinImpl(accessToken);
    }
}
