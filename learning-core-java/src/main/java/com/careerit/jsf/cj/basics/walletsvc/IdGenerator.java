package com.careerit.jsf.cj.basics.walletsvc;

public class IdGenerator {

    private static long id = 10001;

    public static long generateId(){
        return id++;
    }
}
