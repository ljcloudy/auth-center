package com.cloudy.authcenter.social.weixin.config;


import com.cloudy.authcenter.properties.SecurityProperties;
import com.cloudy.authcenter.properties.WeixinProperties;
import com.cloudy.authcenter.social.weixin.connect.WeixinConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.social.config.annotation.ConnectionFactoryConfigurer;
import org.springframework.social.config.annotation.SocialConfigurerAdapter;
import org.springframework.social.connect.ConnectionFactory;
import org.springframework.web.servlet.View;

/**
 * Created by ljy_cloudy on 2018/10/14.
 */
@Configuration
@ConditionalOnProperty(prefix = "cloudy.security.social.weixin", name = "app-id")
public class WeixinAutoConfiguration extends SocialConfigurerAdapter {

    @Autowired
    private SecurityProperties securityProperties;


    @Override
    public void addConnectionFactories(ConnectionFactoryConfigurer connectionFactoryConfigurer, Environment environment) {
        WeixinProperties weixin = securityProperties.getSocial().getWeixin();
        WeixinConnectionFactory weixinConnectionFactory = new WeixinConnectionFactory(weixin.getProviderId(), weixin.getAppId(), weixin.getAppSecret());

        connectionFactoryConfigurer.addConnectionFactory(weixinConnectionFactory);
    }


//
//    @Bean({"connect/weixinConnect", "connect/weixinConnected"})
//    @ConditionalOnMissingBean(name = "weixinConnectedView")
//    public View weixinConnectedView() {
//        return new CloudyConnectView();
//    }

}
