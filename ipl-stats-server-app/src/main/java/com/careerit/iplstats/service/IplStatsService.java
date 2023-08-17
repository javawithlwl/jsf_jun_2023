package com.careerit.iplstats.service;

import com.careerit.iplstats.dto.*;

import java.util.List;

public interface IplStatsService {

    List<String> getTeamNames();
    TeamStatsDto getTeamStats(String teamName);
    MaxPaidPlayerDto getMaxPaidPlayers(String teamName);
    List<TeamAmountStatsDto> getTeamAmountStats();
    List<RoleCountStatsDto> getRoleCountStats();
    TeamStatsSummary getTeamStatsSummary(String teamName);
}
