package com.careerit.sc.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class ContactDaoImpl implements ContactDao{

    @Autowired
    private DataProvider dataProvider;
    @Override
    public List<String> findContactNames() {
       return dataProvider.getNames();
    }


}
