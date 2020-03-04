package com.myyhhuang.hellofeign;


import com.myyhhuang.hellofeign.beanim.IMCountyList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(value = "hello-service", configuration = DisableHystrixConfiguration.class)
//@FeignClient(value = "hello-service", fallbackFactory = HystrixClientFallbackFactory.class)
@FeignClient(value = "hello-service", fallback = ServiceHystrix.class)
public interface IHelloService {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public IMCountyList hello();

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello1(@RequestParam("name") String name);
/*
    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public User hello2(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3", method = RequestMethod.GET)
    public String hello3(@RequestBody User user);*/
}
