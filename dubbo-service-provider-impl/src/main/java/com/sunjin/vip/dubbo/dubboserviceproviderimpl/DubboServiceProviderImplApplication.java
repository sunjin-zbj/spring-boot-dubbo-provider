package com.sunjin.vip.dubbo.dubboserviceproviderimpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:spring-application-dubbo-provider.xml"})
public class DubboServiceProviderImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboServiceProviderImplApplication.class);
    }

}
