package com.tju.bianyuan.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 1）想要远程调用别的服务
 * 2） 引入open-feigin
 * 3） 编写一个接口，告诉SpringCloud这个接口需要调用远程服务
 * 		声明接口的每一个方法都是调用哪个远程服务的哪个请求
 * 		开启远程调用功能
 */
@EnableFeignClients(basePackages ="com.tju.bianyuan.member.feign" )
@EnableDiscoveryClient
@SpringBootApplication
public class BianyuanMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(BianyuanMemberApplication.class, args);
	}

}
