package com.general.generalapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.general.generalapp.service.HelloWorldBean;

@SpringBootApplication
public class GeneralappApplication {

	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(GeneralappApplication.class, args);
		
		HelloWorldBean bean = ctx.getBean(HelloWorldBean.class);
	      bean.sayHello();
	}
}
