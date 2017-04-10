package com.kxlist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxd
 * @create 2017-04-01 12:56
 **/
@RestController
public class Hello {

    @GetMapping("/")
    public String hello(){
        System.out.println("==================================== welcome!!!!");
        return "hello World!";
    }

    @GetMapping("/{a}/{b}")
    public String add(@PathVariable("a") int a,@PathVariable("b") int b){
        return a+b+"";
    }
}
