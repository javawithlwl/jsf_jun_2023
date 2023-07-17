package com.careerit.jsf.cj.basics.empstats;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

  private List<Employee> empList;

  public EmployeeService() {
    empList = CsvReaderUtil.loadDataFromFile();
  }

  public List<String> getCountryNames() {
    List<String> countryNameList = new ArrayList<>();
    for (Employee emp : empList) {
      String countryName = emp.getCountry();
      if (!countryNameList.contains(countryName)) {
        countryNameList.add(countryName);
      }
    }
    return countryNameList;
  }

  public long getCountOfEmployeesByCountry(String countryName) {
    long count = 0;
    for (Employee emp : empList) {
      if (emp.getCountry().equalsIgnoreCase(countryName)) {
        count++;
      }
    }
    return count;
  }

  public double getTotalSalaryByCountry(String countryName) {
    double totalSalary = 0;
    for (Employee emp : empList) {
      if (emp.getCountry().equalsIgnoreCase(countryName)) {
        totalSalary += emp.getSalary();
      }
    }
    return totalSalary;
  }

  public double getTotalSalary() {
    double totalSalary = 0;
    for (Employee emp : empList) {
      totalSalary += emp.getSalary();
    }
    return totalSalary;
  }

  public List<Employee> getMaxPaidEmployeesOf(String countryName) {
    List<Employee> empListOfCountry = getEmployeesOf(countryName);
    double maxSalary = getMaxSalary(empListOfCountry);
    List<Employee> maxPaidEmpList = new ArrayList<>();
    for (Employee emp : empListOfCountry) {
      if (emp.getSalary() == maxSalary) {
        maxPaidEmpList.add(emp);
      }
    }
    return maxPaidEmpList;
  }

  public List<Employee> getMaxPaidEmployees() {
    double maxSalary = getMaxSalary(empList);
    List<Employee> maxPaidEmpList = new ArrayList<>();
    for (Employee emp : empList) {
      if (emp.getSalary() == maxSalary) {
        maxPaidEmpList.add(emp);
      }
    }
    return maxPaidEmpList;
  }
  // Search the employee by name or email or country
  public List<Employee> search(String str){
    // TODO : Implement this method
    return null;
  }
  public List<Employee> getSecondMaxPaidEmployee(String country){
    // TODO : Implement this method
    return null;
  }
  public List<Employee> getEmployeesSalaryBetween(double min,double max){
    // TODO : Implement this method
    return null;
  }
  public List<String> getEmployeeNames(){
    // TODO : Implement this method
    return null;
  }

  private List<Employee> getEmployeesOf(String country) {
    List<Employee> employees = new ArrayList<>();
    for (Employee emp : empList) {
      if (emp.getCountry().equalsIgnoreCase(country)) {
        employees.add(emp);
      }
    }
    return employees;
  }

  private double getMaxSalary(List<Employee> empList) {
    double maxSalary = 0;
    for (Employee emp : empList) {
      if (emp.getSalary() > maxSalary) {
        maxSalary = emp.getSalary();
      }
    }
    return maxSalary;
  }
}
