package com.cloudy.authcenter.config;

import com.cloudy.authcenter.properties.SecurityProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ljy_cloudy on 2018/10/28.
 */
@Configuration
@EnableConfigurationProperties(SecurityProperties.class)
public class SecurityCorePropertiesConfig {
}
