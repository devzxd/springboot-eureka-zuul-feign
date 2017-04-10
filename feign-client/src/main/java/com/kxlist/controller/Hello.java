package com.kxlist.controller;

import com.kxlist.service.IHelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zxd
 * @create 2017-04-01 14:32
 **/
@RestController
public class Hello {
    @Autowired
    private IHelloService helloService;
    @GetMapping("/")
    public String hello(){
        System.out.println("======客户端进来了！");
        return helloService.hello();
    }

    @GetMapping("/{a}/{b}")
    public String add(@PathVariable("a") int a,@PathVariable("b") int b){
        return helloService.add(a,b);
    }
 /*   @Autowired
    RestTemplate restTemplate;

    @GetMapping("/")
    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String add() {
        return restTemplate.getForEntity("http://service/", String.class).getBody();
    }

    public String addServiceFallback(){
        return "服务出错！";
    }*/
}
