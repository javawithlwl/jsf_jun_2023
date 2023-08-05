package com.careerit.sc.conflict;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbUserService implements UserService{
    @Override
    public List<String> getUserNames() {
        return List.of("Krish","Manoj","Charan");
    }
}
