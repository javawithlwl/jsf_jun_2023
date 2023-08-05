package com.careerit.sc.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

        @Bean
        public Greetings greetings(){
            Greetings greetings = new Greetings();
            greetings.setMessage("Welcome to Spring");
            return greetings;
        }
}
