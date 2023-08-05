package com.careerit.sc.lifecycle;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.sc.lifecycle")
public class Manager {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(Manager.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.showUsers();
        applicationContext.close();

    }
}
