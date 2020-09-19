package com.ljm.pay.wxpay;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { JpaRepositoriesAutoConfiguration.class })
@MapperScan(basePackages = "com.ljm.pay.wxpay.mapper")
public class WxpayApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxpayApplication.class, args);
    }

}
