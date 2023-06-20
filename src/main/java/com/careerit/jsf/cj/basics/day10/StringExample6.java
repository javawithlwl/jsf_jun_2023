package com.careerit.jsf.cj.basics.day10;

public class StringExample6 {

  public static void main(String[] args) {

    String name = "Krish";
    String company = "Wipro";
    String city = "Bangalore";
    String country = "India";
    StringBuilder sb = new StringBuilder();
    sb.append(name).append(",").append(company).append(",").append(city).append(",").append(country);
    System.out.println(sb.toString());

  }
}
