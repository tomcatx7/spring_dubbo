package com.zxj.provider.service.imp;

import com.alibaba.dubbo.config.annotation.Service;
import com.zxj.api.service.HelloService;

@org.springframework.stereotype.Service
@Service(version = "1.0.0", interfaceClass = HelloService.class)
public class HelloServiceImp implements HelloService {
    public String sayHello() {
        return "hello";
    }
}
