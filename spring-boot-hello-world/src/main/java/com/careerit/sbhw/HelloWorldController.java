package com.careerit.sbhw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class HelloWorldController {

        @GetMapping("/hello")
        public String hello(){
            return "Hello World";
        }
        @GetMapping("/info")
        public UserInfo getUserInfo() {
            UserInfo userInfo = new UserInfo();
            userInfo.setName("Krish");
            userInfo.setEmail("krish.t@gmail.com");
            return userInfo;
        }

}
