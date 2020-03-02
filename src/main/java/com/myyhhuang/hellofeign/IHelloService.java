package com.myyhhuang.hellofeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("hello-service")
public interface IHelloService {
    @RequestMapping("/hello")
    IMCountyList hello();

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3", method = RequestMethod.GET)
    public String hello(@RequestBody User user);
}
