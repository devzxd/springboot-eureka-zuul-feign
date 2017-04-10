package com.kxlist.service.hystrix;

import com.kxlist.service.IHelloService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zxd
 * @create 2017-04-01 16:37
 **/
@Component
public class HelloServiceHystrix implements IHelloService {
    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String add(@PathVariable("a") int a, @PathVariable("b") int b) {
        return "出错了！";
    }
}
