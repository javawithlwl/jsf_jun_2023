package com.careerit.eci.service;

import com.careerit.eci.domain.Employee;
import com.careerit.eci.dto.EmployeeDto;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements  EmployeeService{

    private List<Employee> empList;
    public EmployeeServiceImpl(){
        empList = new ArrayList<>();
        // Write code here to load the data from employee_info.csv file and store it in empList
    }

    @Override
    public List<EmployeeDto> getFormattedEmpData() {
        return null;
    }

    @Override
    public String exportToCsv() {
        return null;
    }
}
