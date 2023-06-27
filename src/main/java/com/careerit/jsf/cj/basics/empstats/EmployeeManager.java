package com.careerit.jsf.cj.basics.empstats;

import java.util.List;

public class EmployeeManager {

  public static void main(String[] args) {

    EmployeeService employeeService = new EmployeeService();
    // Get the country names
    List<String> countryNames = employeeService.getCountryNames();
    System.out.println(countryNames);

    // Get the count of employees by country
    String countryName = "USA";
    long count = employeeService.getCountOfEmployeesByCountry(countryName);
    System.out.println("Count of employees from "+countryName+" is "+count);

    // Get the total salary by country
    double totalSalary = employeeService.getTotalSalaryByCountry(countryName);
    System.out.println("Total salary of employees from "+countryName+" is "+totalSalary);

    // Get the total salary of all employees
    totalSalary = employeeService.getTotalSalary();
    System.out.println("Total salary of all employees is "+totalSalary);

    // Get the max paid employees of a country
    List<Employee> maxPaidEmpList = employeeService.getMaxPaidEmployeesOf(countryName);
    System.out.println("Max paid employees of "+countryName+" is "+maxPaidEmpList);

    // Get the max paid employee of all countries
    List<Employee> maxPaidEmpListAll = employeeService.getMaxPaidEmployees();
    System.out.println("Max paid employees of all countries is "+maxPaidEmpListAll);

  }
}
