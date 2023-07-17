package com.careerit.jsf.cj.basics.day23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record Employee(String name, double salary, int dept) { }
public class UserDataExample {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Krish", 1000, 10);
        Employee emp2 = new Employee("Manoj", 2000, 20);
        Employee emp3 = new Employee("Charan", 3000, 10);
        Employee emp4 = new Employee("Manoj", 5000, 20);
        Employee emp5 = new Employee("Manoj", 5000, 10);

        List<Employee> empList = new ArrayList<>(List.of(emp1, emp2, emp3, emp4, emp5));

        empList.sort(Comparator.comparing(Employee::name)
                .thenComparing(Comparator.comparing(Employee::salary).reversed())
                .thenComparing(Comparator.comparing(Employee::dept).reversed())
        );

        empList.forEach(ele->{
            System.out.println(ele.name()+" "+ele.salary()+" "+ele.dept());
        });


    }
}
