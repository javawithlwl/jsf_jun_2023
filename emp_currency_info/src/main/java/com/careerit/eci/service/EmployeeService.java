package com.careerit.eci.service;

import com.careerit.eci.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

        List<EmployeeDto> getFormattedEmpData();
        String exportToCsv();

}
