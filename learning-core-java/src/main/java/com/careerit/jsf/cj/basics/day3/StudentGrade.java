package com.careerit.jsf.cj.basics.day3;

import java.util.Scanner;

public class StudentGrade {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of the student :");
    String name = sc.nextLine();
    System.out.println("Enter the score (>0 and <=10) :");
    int score = sc.nextInt();
    String grade = "No Grade";
    if(score >=1 && score <=5) {
      grade = "C";
    }else if(score >=6 && score <=8) {
      grade = "B";
    }else if(score >=9 && score <=10) {
      grade = "A";
    }
    System.out.println("Student name :"+name+", score :"+score+" and grade is :"+grade);

  }
}
