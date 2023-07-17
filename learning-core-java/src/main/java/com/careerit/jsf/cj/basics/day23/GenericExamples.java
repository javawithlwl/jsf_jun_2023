package com.careerit.jsf.cj.basics.day23;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GenericExamples {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("Krish");


        for (String str : list) {
            System.out.println(str.toUpperCase());
        }
        List<String> names = asList(new String[]{"Krish", "Manoj", "Charan", "Manoj", "Rajani", "Manoj"});
        System.out.println(names);
    }
    public static <T> List<T> asList(T[] arr){
       return Arrays.stream(arr).toList();
    }
}
