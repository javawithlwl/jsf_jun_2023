package com.careerit.jsf.cj.basics.iplstats.service;

import com.careerit.jsf.cj.basics.iplstats.dto.*;

import java.util.List;

public interface IplStatsService {

    List<String> getTeamLabels();
    List<TeamAmountStatsDto> getAllTeamAmountStats();
    List<PlayerDetailsDto> getPlayersOf(String teamLabel);
    TeamRoleAmountStatsDto getTeamRoleAmountStats(String teamLabel, String roleName);
    List<TopPaidPlayerDto> getTopPaidPlayersOfEachTeam();
    List<PlayerDetailsDto> getTopPaidPlayersOf(String role);
    List<PlayerDetailsDto> getPlayers();
    List<TeamStatsDto> getTeamStats();

}
