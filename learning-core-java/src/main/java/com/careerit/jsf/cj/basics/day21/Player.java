package com.careerit.jsf.cj.basics.day21;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Player {
    private long id;
    private String name;
    private String role;
    private String team;
    private String country;
    private double amount;

}
