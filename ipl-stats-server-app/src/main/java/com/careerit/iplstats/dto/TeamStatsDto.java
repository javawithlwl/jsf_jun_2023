package com.careerit.iplstats.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TeamStatsDto {

    private String teamName;
    private double maxAmount;
    private double minAmount;
    private double avgAmount;
    private double totalAmount;

}
