package com.myyhhuang.hellofeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("hello-service")
public interface IHelloService {
    @RequestMapping("/hello")
    IMCountyList hello();
}
