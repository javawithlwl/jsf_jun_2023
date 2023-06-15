package com.careerit.jsf.cj.basics.day7;

public class ArrayProcessing {

  public static void main(String[] args) {

    String[] names = new String[]{"Krish", "Manoj", "Charan", "Tanvi", "Sai"};

    for (int i = names.length - 1; i >= 0; i--) {
      System.out.println(names[i]);
    }
    // Display to names
    for (int i = names.length - 3; i < names.length; i++) {
      System.out.println(names[i]);
    }

    for (int i = 0; i < 3; i++) {
      System.out.println(names[i]);
    }
    System.out.println("-------------------------------");
    for(String name:names) {
        System.out.println(name);
    }

  }
}
