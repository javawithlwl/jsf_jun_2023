package com.careerit.jsf.cj.basics.day11;

class Employee {
  int empno;
  String name;
  double salary;

  Employee(int empno, String name, double salary) {
    this.empno = empno;
    this.name = name;
    this.salary = salary;
  }

  public void show() {
    System.out.println("Empno :" + empno + " Name :" + name + " Salary :" + salary);
  }
}

public class MethodExample {


  public static void main(String[] args) {
    int a = 10, b = 20;
    swap(a, b);
    Employee emp = new Employee(1001, "Krish", 45000);
    emp.show();
    incrementSalary(emp, 5000);
    System.out.println(emp.salary);
  }

  public static void incrementSalary(Employee emp, double amount) {
    emp.salary += amount;
    System.out.println(emp.salary);
  }

  public static void swap(int a, int b) {
    int t = a;
    a = b;
    b = t;
  }
}
