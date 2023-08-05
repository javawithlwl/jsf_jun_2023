package com.careerit.sc.conflict;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {

    private UserService userService;

    @Autowired
    public UserDetailsService(@Qualifier("dbUserService") UserService userService){
        this.userService = userService;
    }

    public void printUserNames(){
        userService.getUserNames().forEach(System.out::println);
    }
}
