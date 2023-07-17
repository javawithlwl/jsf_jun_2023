package com.careerit.jsf.cj.basics.empstats;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Employee {
    private long empno;
    private String ename;
    private String email;
    private double salary;
    private String country;
}
