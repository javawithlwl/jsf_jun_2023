package com.careerit.sc.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.careerit.sc.scope")
public class ContactManager {

    public static void main(String[] args) {

        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(ContactManager.class);

        ContactService contactService1 = applicationContext1.getBean(ContactService.class);
        ContactService contactService2 = applicationContext1.getBean(ContactService.class);
        ContactService contactService3 = applicationContext1.getBean(ContactService.class);

        System.out.println(contactService1);
        System.out.println(contactService2);
        System.out.println(contactService3);

        ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(ContactManager.class);
        ContactService contactService4 = applicationContext2.getBean(ContactService.class);
        ContactService contactService5 = applicationContext2.getBean(ContactService.class);

        System.out.println(contactService4);
        System.out.println(contactService5);


    }
}
