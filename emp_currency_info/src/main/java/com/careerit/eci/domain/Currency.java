package com.careerit.eci.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Currency {

    private String name;
    private String code;
    private int decimals;
    private String symbol;
}
