package com.careerit.sc.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.sc.di")
public class Manager {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Manager.class);
        GreetingService greetings = applicationContext.getBean(GreetingService.class);
        System.out.println(greetings.greet("Krish"));
        String[] arr = applicationContext.getBeanDefinitionNames();
        for(String name:arr){
            System.out.println(name);
        }
    }
}
