package com.fl.flink.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fenglei.fl
 * @CreateTime: 2020/7/18 22:09
 * @Description:
 */
@RestController("/flink")
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "hello world";
    }
}
