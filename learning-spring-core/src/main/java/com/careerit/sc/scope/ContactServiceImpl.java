package com.careerit.sc.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope("prototype")
public class ContactServiceImpl implements ContactService{
    @Override
    public List<String> getContactNames() {
        return List.of("Sai","Rani","Suresh");
    }
}
