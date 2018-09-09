package com.learn.main;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learn.components.MyService;

public class AppMain {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(Config.class);
    MyService myService = context.getBean(MyService.class);
    myService.runSimpleMethod();
  }
}
