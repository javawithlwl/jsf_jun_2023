package com.careerit.sc.basics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
        @Bean
        public AppUser appUser(){
            AppUser appUser = new AppUser();
            appUser.setName("Krish");
            appUser.setEmail("krish.t@gmail.com");
            appUser.setMobile("9876543210");
            appUser.setCountry("India");
            return appUser;
        }
}
