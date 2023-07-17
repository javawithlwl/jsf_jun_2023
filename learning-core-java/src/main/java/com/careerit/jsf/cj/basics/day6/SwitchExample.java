package com.careerit.jsf.cj.basics.day6;

public class SwitchExample {

  public static void main(String[] args) {
    System.out.println(getMonthName(1));
    System.out.println(getMonthName(13));
    System.out.println(getMonthName(12));
  }

      public static String getMonthName(int month) {

        String monthName = "";
        switch (month) {
          case 1:
            monthName = "January";
            break;
          case 2:
            monthName = "February";
            break;
          case 3:
            monthName = "March";
            break;
          case 4:
            monthName = "April";
            break;
          case 5:
            monthName = "May";
            break;
          case 6:
            monthName = "June";
            break;
          case 7:
            monthName = "July";
            break;
          case 8:
            monthName = "August";
            break;
          case 9:
            monthName = "September";
            break;
          case 10:
            monthName = "October";
            break;
          case 11:
            monthName = "November";
            break;
          case 12:
            monthName = "December";
            break;
          default:
            monthName = "Invalid month";
            break;
        }
        return monthName;
      }
}
