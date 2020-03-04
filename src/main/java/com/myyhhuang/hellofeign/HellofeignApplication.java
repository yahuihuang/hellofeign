package com.myyhhuang.hellofeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
/*
@EnableFeignClients(basePackages = {"com.myyhhuang.hellofeign"} )
@ComponentScan(basePackages = {"com.myyhhuang.hellofeign"} )
@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrix*/
//@EnableCircuitBreaker
//@SpringCloudApplication
//@EnableCircuitBreaker
//@EnableHystrix

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class HellofeignApplication /*extends SpringBootServletInitializer*/ {

	public static void main(String[] args) {
		SpringApplication.run(HellofeignApplication.class, args);
	}
/*
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(HellofeignApplication.class);
	}*/
}
