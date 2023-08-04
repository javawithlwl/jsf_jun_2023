package com.careerit.sc.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactServiceImpl implements ContactService{
    @Autowired
    private ContactDao contactDao;
    @Override
    public List<String> getContactNames() {
        return contactDao.findContactNames();
    }

}
