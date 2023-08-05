package com.careerit.sc.conflict;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.sc.conflict")
public class Manager {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Manager.class);
        UserDetailsService userDetailsService = applicationContext.getBean(UserDetailsService.class);
        userDetailsService.printUserNames();
    }
}
