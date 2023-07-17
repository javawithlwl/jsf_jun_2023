package com.careerit.jsf.cj.basics.day13;

class Employee {

  private int empno;
  private String ename;
  private double salary;
  private String email;
  private String mobile;

  public Employee(int empno, String ename, double salary) {
    this(empno, ename, salary, "NA");
  }

  public Employee(int empno, String ename, double salary, String email) {
    this(empno, ename, salary, email, "NA");
  }

  public Employee(int empno, String ename, double salary, String email, String mobile) {
    this.empno = empno;
    this.ename = ename;
    this.salary = salary;
    this.email = email;
    this.mobile = mobile;
  }

  public void showDetails() {
    System.out.println(empno + " " + ename + " " + salary + " " + email + " " + mobile);
  }

}


public class ConstructorExample {
  public static void main(String[] args) {
    Employee employee = new Employee(1001, "Krish", 45000);
    employee.showDetails();
  }
}
