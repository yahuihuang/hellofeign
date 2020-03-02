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

    @RequestMapping(value = "/feign-consumer2", method = RequestMethod.GET)
    public String helloConsumer2() {
        StringBuffer sb = new StringBuffer();
        sb.append(helloService.hello("Grace")).append("\n");
        sb.append(helloService.hello("Amber", 8)).append("\n");

        //helloService.hello(new User("Kevin", 45));
        sb.append(helloService.hello(new User("Kevin", 45))).append("\n");
        return sb.toString();
    }
}
