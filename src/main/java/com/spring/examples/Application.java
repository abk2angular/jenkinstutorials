package com.spring.examples;

import com.spring.examples.config.AppConfig;
import com.spring.examples.services.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TestService testService = context.getBean("testService", TestService.class);
        testService.test();


    }

}
