package com.igor.mdm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.igor.mdm.client")
@ConfigurationPropertiesScan(basePackageClasses = MdmAdapterApp.class)
public class MdmAdapterApp {

    public static void main(String[] args) {
        SpringApplication.run(MdmAdapterApp.class, args);
    }

}
