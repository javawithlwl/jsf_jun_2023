package com.careerit.jsf.cj.basics.iplstats.dto;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayerDetailsDto {

        private String label;
        private String teamName;
        private String playerName;
        private String role;
        private double amount;
}
