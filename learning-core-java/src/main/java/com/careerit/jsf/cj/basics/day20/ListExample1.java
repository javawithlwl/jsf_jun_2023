package com.careerit.jsf.cj.basics.day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Krish");
        list.add("Manoj");
        list.add("Charan");
        list.add("Manoj");
        for (String str : list) {
            System.out.println(str.toUpperCase());
        }

        System.out.println(list.get(1).toUpperCase());
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
        }
        System.out.println("After removing element :"+list);

        list.forEach(System.out::println);

        Iterator<String> iterator = list.iterator();
        int i = 0;
        while(iterator.hasNext()){
            String ele = iterator.next();
            System.out.println(ele);
            if(ele.equals("Manoj") && i == 0){
                iterator.remove();
                i++;
            }
        }
        System.out.println(list);

        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            String ele = listIterator.next();
            if(ele.equals("Manoj")){
                listIterator.set("Manoj Kumar");
            }
        }
        System.out.println(list);
        while(listIterator.hasPrevious()){
            String ele = listIterator.previous();
            System.out.println(ele);
        }
    }
}
