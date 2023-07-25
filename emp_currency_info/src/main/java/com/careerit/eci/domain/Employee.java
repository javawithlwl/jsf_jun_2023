package com.careerit.eci.domain;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private double salary;
    private String currencyCode;

}
