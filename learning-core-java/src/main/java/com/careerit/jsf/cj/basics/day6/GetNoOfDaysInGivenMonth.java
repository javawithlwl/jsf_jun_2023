package com.careerit.jsf.cj.basics.day6;

public class GetNoOfDaysInGivenMonth {

  public static void main(String[] args) {
    System.out.println(getNoOfDays(2, 2020));
  }

  public static int getNoOfDays(int month, int year) {
    int days = 0;
    switch (month) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        days = 31;
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        days = 30;
        break;
      case 2:
        days = isLeapYear(year) ? 29 : 28;
        break;
      default:
        days = 0;
        break;
    }
    return days;

  }

  public static boolean isLeapYear(int year) {
    return (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0));
  }

}
