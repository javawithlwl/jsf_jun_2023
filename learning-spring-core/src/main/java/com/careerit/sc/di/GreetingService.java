package com.careerit.sc.di;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GreetingService {


    private final Greetings greetings;


    public String greet(String name) {
        return "Hello " + name + " " + greetings.getMessage();
    }
}
