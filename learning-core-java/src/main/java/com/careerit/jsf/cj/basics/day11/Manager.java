package com.careerit.jsf.cj.basics.day11;

public class Manager {

  static {
    System.out.println("sb1");
  }

  public static void main(String[] args) {
    System.out.println("Main method");
    TaskManager.viewTasks();
    TaskManager.viewTasks();
    TaskManager.viewTasks();
  }
}
