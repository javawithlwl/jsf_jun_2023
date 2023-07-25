package com.careerit.eci.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDto {
    private long empno;
    private String fullName;
    private String currencyCode;
    private double salary;
    private String formattedSalary;
}
