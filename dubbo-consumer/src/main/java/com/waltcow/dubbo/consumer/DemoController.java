package com.waltcow.dubbo.consumer;

import com.waltcow.dubbo.consumer.api.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @DubboReference(version = "${demo.service.version}")
    private DemoService demoService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return demoService.sayHello("world");
    }
}