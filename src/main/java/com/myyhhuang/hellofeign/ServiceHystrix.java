package com.myyhhuang.hellofeign;

import com.myyhhuang.hellofeign.beanim.IMCountyList;
import org.springframework.stereotype.Component;

@Component
public class ServiceHystrix implements IHelloService {
    @Override
    public IMCountyList hello() {
        IMCountyList imCountyList = new IMCountyList();
        return imCountyList;
    }

    @Override
    public String hello1(String name) {
        return "error";
    }

    /*
    @Override
    public User hello2(String name, Integer age) {
        return new User("未知", null);
    }

    @Override
    public String hello3(User user) {
        return "error";
    }*/
}
