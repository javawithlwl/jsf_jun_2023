package com.careerit.jsf.cj.basics.day22;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Krish");
        names.add("Manoj");
        names.add("Charan");
        names.add("Manoj");
        names.add("Charan");
        names.add("Balu");
        System.out.println(names.size());
        System.out.println(names);
        names.forEach(System.out::println);
        names.remove("Manoj");
        System.out.println(names);
    }
}
