package com.waltcow.dubbo.provider.bootstrap;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableAutoConfiguration
public class DubboProviderBootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboProviderBootstrap.class).run(args);
    }
}
