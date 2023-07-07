package com.careerit.jsf.cj.basics.iplstats.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeamRoleAmountStatsDto {
        private String teamName;
        private String label;
        private String roleName;
        private double totalAmount;
}
