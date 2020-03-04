package com.myyhhuang.hellofeign;

import com.myyhhuang.hellofeign.beanim.IMCountyList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    IHelloService helloService;

    @RequestMapping(value = "/feign-consumer1", method = RequestMethod.GET)
    public IMCountyList helloConsumer2() {
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer2", method = RequestMethod.GET)
    public String helloConsumer() {
        return helloService.hello1("Grace");
    }

    /*
    @RequestMapping(value = "/feign-consumer1", method = RequestMethod.GET)
    public String helloConsumer1() {
        return helloService.hello1("Grace");
    }

    @RequestMapping(value = "/feign-consumer3", method = RequestMethod.GET)
    public String helloConsumer3() {
        StringBuffer sb = new StringBuffer();
        sb.append(helloService.hello1("Grace")).append("\n");
        sb.append(helloService.hello2("Amber", 8)).append("\n");

        //helloService.hello(new User("Kevin", 45));
        sb.append(helloService.hello3(new User("Kevin", 45))).append("\n");
        return sb.toString();
    }*/

    /*
    //繼承
    @Autowired
    RefactorHelloService refactorHelloService;

    @RequestMapping(value = "/feign-consumer3", method = RequestMethod.GET)
    public String helloConsumer3() {
        StringBuffer sb = new StringBuffer();
        sb.append(refactorHelloService.hello("Grace")).append("\n");
        sb.append(refactorHelloService.hello("Austin", 12)).append("\n");
        sb.append(refactorHelloService.hello(new com.myyhhuang.helloserviceapi.User("Amber", 8))).append("\n");

        return sb.toString();
    }*/
}
