package com.zxj.client.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zxj.api.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Reference(version = "1.0.0")
    HelloService helloService;

    public String sayHello(){
        return helloService.sayHello();
    }
}
