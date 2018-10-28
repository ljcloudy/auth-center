package com.cloudy.authcenter.validateCode.sms;


import com.cloudy.authcenter.properties.SecurityProperties;
import com.cloudy.authcenter.validateCode.ValidateCode;
import com.cloudy.authcenter.validateCode.ValidateCodeGenerator;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * Created by ljy_cloudy on 2018/10/10.
 */
@Component("smsValidateCodeGenerator")
public class SmsCodeGenerator implements ValidateCodeGenerator {

    @Autowired
    private SecurityProperties securityProperties;

    @Override
    public ValidateCode generate(ServletWebRequest request) {
        String code = RandomStringUtils.randomNumeric(securityProperties.getCode().getSms().getLength());

        return new ValidateCode(code, securityProperties.getCode().getSms().getExpireIn());
    }
}
