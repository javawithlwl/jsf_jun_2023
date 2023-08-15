package com.careerit.iplstats.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerDto {

        private Long id;
        private String name;
        private String role;
        private String teamName;
        private double amount;
}
