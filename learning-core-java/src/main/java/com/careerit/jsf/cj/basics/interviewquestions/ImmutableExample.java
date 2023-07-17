package com.careerit.jsf.cj.basics.interviewquestions;

record Employee(int empno, String name, double salary, String dept) {

    public Employee updateSalary(double salary){
        return new Employee(empno, name, salary, dept);
    }
}


public class ImmutableExample {

    public static void main(String[] args) {
        Employee emp = new Employee(1001, "Krish", 45000, "HR");
        System.out.println(emp);
        Employee updatedEmp = emp.updateSalary(50000);
        System.out.println(emp);
        System.out.println(updatedEmp);
        System.out.println(emp.name());
    }
}
