package com.careerit.jsf.cj.basics.day23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionSortingExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(11);
        list.add(14);
        list.add(13);
        list.add(12);

//        List<Integer> sortedList = list.stream().sorted().toList();
//        System.out.println(list);
//        System.out.println(sortedList);
         list.sort(Comparator.comparing(Integer::intValue).reversed());
         System.out.println(list);

    }
}
