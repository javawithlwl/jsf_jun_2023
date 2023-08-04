package com.careerit.sc.basics;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataProvider {

        public List<String> getNames(){
            return List.of("Krish","Manoj","Charan","Tanvi","Sai Kumar");
        }
}
