package com.careerit.iplstats.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TeamAmountStatsDto {
    private String teamName;
    private double totalAmount;
}
