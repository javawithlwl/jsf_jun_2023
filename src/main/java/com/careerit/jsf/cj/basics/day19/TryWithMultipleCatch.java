package com.careerit.jsf.cj.basics.day19;

public class TryWithMultipleCatch {

  public static void main(String[] args) {

    System.out.println("Start of main method");
    String[] ids = {"1", "2", "3", "4", "5"};
    try {
      String idStr = ids[2];
      int id = Integer.parseInt(idStr);
      System.out.println(id);
    } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
      System.out.println("Please provide valid index or valid number");
    } catch (Exception e) {
      System.out.println("Something went wrong");
    }
    System.out.println("End of main method");
  }
}
