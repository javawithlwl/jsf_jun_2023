package com.careerit.sc.conflict;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryUserService implements UserService{
    @Override
    public List<String> getUserNames() {
        return List.of("Sai","Rani","Suresh");
    }
}
