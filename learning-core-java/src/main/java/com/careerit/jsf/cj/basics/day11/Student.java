package com.careerit.jsf.cj.basics.day11;

public class Student {

  private int rollno;
  private String name;
  private String email;
  static String college = "ABC College";
  static int count = 0;

  public Student(int rollno, String name, String email) {
    this.rollno = rollno;
    this.name = name;
    this.email = email;
    count++;
  }

  public void showDetails() {
    System.out.println("Rollno :" + rollno + " Name :" + name + " Email :" + email + " College :" + college);
  }

  public static void showObjectCount() {
    System.out.println("Total objects created :" + count);
  }

  public static void main(String[] args) {
    Student s1 = new Student(1001, "Krish", "krish.t@gmail.com");
    Student s2 = new Student(1002, "Manoj", "manoj.pvn@gmail.com");
    Student s3 = new Student(1003, "Charan", "charan.k@gmail.com");
    Student.showObjectCount();
    s1.showDetails();
    s2.showDetails();
    s3.showDetails();


  }
}
