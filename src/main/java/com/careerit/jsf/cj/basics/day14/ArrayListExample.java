package com.careerit.jsf.cj.basics.day14;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    list.add(101);
    list.add(102);
    list.add(103);
    list.add(104);
    list.add(105);
    list.add(106);

    System.out.println(list);
    list.remove(2);
    list.add(1, 201);
    System.out.println(list.size());
    System.out.println(list);

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    for (Integer ele : list) {
      System.out.println(ele);
    }

    System.out.println(list.contains(101));
    System.out.println(list.indexOf(201));

  }

}
