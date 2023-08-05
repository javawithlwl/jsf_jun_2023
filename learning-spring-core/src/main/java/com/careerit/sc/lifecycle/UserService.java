package com.careerit.sc.lifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Component
public class UserService  {

    private List<String> users;

    public UserService() {
        System.out.println("UserService object created");
    }

    public void showUsers(){
        users.forEach(System.out::println);
    }

    @PreDestroy
    public void close() throws Exception {
        System.out.println("UserService object destroyed");
    }

    @PostConstruct
    public void init() throws Exception {
        users = List.of("Ram","Krish","Manoj");
        System.out.println("UserService object initialized");
    }
}
