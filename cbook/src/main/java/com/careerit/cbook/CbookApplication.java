package com.careerit.cbook;

import com.careerit.cbook.domain.AppUser;
import com.careerit.cbook.repo.AppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class CbookApplication {

    public static void main(String[] args) {
        SpringApplication.run(CbookApplication.class, args);
    }


}
