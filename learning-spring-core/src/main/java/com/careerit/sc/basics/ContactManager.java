package com.careerit.sc.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;



@ComponentScan(basePackages = "com.careerit.sc.basics")
public class ContactManager {

    public static void main(String[] args) {

       /* ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");*/
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ContactManager.class);
        ContactService contactService = applicationContext.getBean(ContactService.class);
        List<String> list = contactService.getContactNames();
        for(String name:list){
            System.out.println(name);
        }
        AppUser appUser = applicationContext.getBean(AppUser.class);
        System.out.println(appUser.getName()+" "+appUser.getEmail()+" "+appUser.getMobile()+" "+appUser.getCountry());

    }
}
