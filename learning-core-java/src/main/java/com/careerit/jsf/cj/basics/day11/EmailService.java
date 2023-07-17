package com.careerit.jsf.cj.basics.day11;

public class EmailService {

  public static void main(String[] args) {
    String data = "Krish,krish@gmail.com,300,2023-07-01|Manoj,manoj@gmail.com,500,2023-07-01";
    String[] arr = data.split("\\|");

    for (String str : arr) {
      String[] dataArr = str.split(",");
      String name = dataArr[0];
      String email = dataArr[1];
      String amount = dataArr[2];
      String date = dataArr[3];
      StringBuilder sb = new StringBuilder();
      sb.append("Hi ").append(name).append(",\n");
      sb.append("\tYour due amount is ")
          .append(amount)
          .append(" and your due date is ")
          .append(date)
          .append(", please pay the amount before due date.\n");
      sb.append("\nThank you");
      String message = sb.toString();
      sendEmail(email, message);
    }
  }

  private static void sendEmail(String email, String message) {
    System.out.println("Email sent to :" + email);
    System.out.println(message);
  }
}


// Hi Krish,
//    Your due amount is 300 and your due date is 2023-07-01, please pay the amount before due date.
// Thank you
