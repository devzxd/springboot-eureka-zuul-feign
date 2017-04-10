package com.kxlist.service;

import com.kxlist.service.hystrix.HelloServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zxd
 * @create 2017-04-01 14:36
 **/

@FeignClient(value = "service",fallback = HelloServiceHystrix.class)
public interface IHelloService {
    @GetMapping("/")
    String hello();

    @GetMapping("/{a}/{b}")
    String add(@PathVariable("a") int a,@PathVariable("b") int b);
}

