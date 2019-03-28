package com.zxj.client.controller;

import com.zxj.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Autowired
    ClientService clientService;

    @ResponseBody
    @GetMapping("test")
    public String testHello(){
        return clientService.sayHello();
    }
}
