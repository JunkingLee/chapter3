package com.example.demo;

import com.example.demo.config.AppConfig;
import com.example.demo.pojo.BusinessPerson;
import com.example.demo.pojo.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("============测试延迟初始化============");
		System.out.println("@ComponentScan(basePackages = 'com.example.demo.pojo',lazyInit = true)");
		Person person = ctx.getBean(BusinessPerson.class);
		person.service();
//		SpringApplication.run(DemoApplication.class, args);
	}

}
