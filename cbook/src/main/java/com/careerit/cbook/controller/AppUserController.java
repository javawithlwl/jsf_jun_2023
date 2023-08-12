package com.careerit.cbook.controller;

import com.careerit.cbook.dto.AppUserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class AppUserController {

        @PostMapping
        public ResponseEntity<AppUserDto> registerUser(@RequestBody AppUserDto appUserDto){
            return null;
        }
}
