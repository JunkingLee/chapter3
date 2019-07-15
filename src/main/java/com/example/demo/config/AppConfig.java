package com.example.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo.pojo")
//@ComponentScan(basePackages = "com.example.demo.pojo",lazyInit = true)
public class AppConfig {

}
