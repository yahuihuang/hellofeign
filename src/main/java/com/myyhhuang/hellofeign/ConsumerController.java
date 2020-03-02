package com.myyhhuang.hellofeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    IHelloService helloService;

    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
    public IMCountyList helloConsumer() {
        return helloService.hello();
    }
}
