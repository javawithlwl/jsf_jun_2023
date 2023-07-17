package com.careerit.jsf.cj.basics.iplstats.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamStatsDto {

        private String teamLabel;
        private String teamName;
        private double totalAmount;
        private long playerCount;
        private double maxAmount;
        private double minAmount;
        private double avgAmount;
}
