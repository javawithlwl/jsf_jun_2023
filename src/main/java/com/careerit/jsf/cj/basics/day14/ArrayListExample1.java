package com.careerit.jsf.cj.basics.day14;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {

  public static void main(String[] args) {


    List<String> list = new ArrayList<>();
    list.add("Krish");
    list.add("Manoj");
    list.add("Charan");
    list.add("Rajesh");

    System.out.println(list.size());
    System.out.println(list.get(0));
    System.out.println(list.get(list.size() - 1));

    for (int i = list.size() - 1; i >= 0; i--) {
      System.out.println(list.get(i));
    }

    String name = "Charan";
    System.out.println(list.contains(name));
    System.out.println(list.indexOf(name));


  }
}
