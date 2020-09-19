package com.ljm.pay.wxpay.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:application.properties")
@Data
public class WeCahtConfig {
    @Value("${wxpay.appid}")
    private String appId;
    @Value("${wxpay.appsecret}")
    private String appSecret;
}
