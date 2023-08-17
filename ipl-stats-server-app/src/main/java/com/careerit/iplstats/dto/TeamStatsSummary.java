package com.careerit.iplstats.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamStatsSummary {

        private List<PlayerDto> players;
        private MaxPaidPlayerDto maxPaidPlayerDto;
        private TeamStatsDto teamStatsDto;
}
