package com.careerit.jsf.cj.basics.iplstats.service;

import com.careerit.jsf.cj.basics.iplstats.util.JsonReaderUtil;
import com.careerit.jsf.cj.basics.iplstats.domain.PlayerDetails;
import com.careerit.jsf.cj.basics.iplstats.domain.TeamDetails;
import com.careerit.jsf.cj.basics.iplstats.dto.*;

import java.util.ArrayList;
import java.util.List;

public class IplStatsServiceImpl implements IplStatsService {

    private List<TeamDetails> teamDetailsList = new ArrayList<>();

    public IplStatsServiceImpl() {
        teamDetailsList = JsonReaderUtil.loadFromJsonFile();
    }

    @Override
    public List<String> getTeamLabels() {
        return teamDetailsList.stream()
                .map(TeamDetails::getLabel)
                .toList();
    }

    @Override
    public List<TeamAmountStatsDto> getAllTeamAmountStats() {
        return teamDetailsList.stream()
                .map(teamDetails -> {
                    String label = teamDetails.getLabel();
                    double totalAmount = teamDetails.getPlayers()
                            .stream()
                            .mapToDouble(PlayerDetails::getAmount)
                            .sum();
                    TeamAmountStatsDto teamAmountStatsDto = new TeamAmountStatsDto();
                    teamAmountStatsDto.setTeamLabel(label);
                    teamAmountStatsDto.setTotalAmount(totalAmount);
                    return teamAmountStatsDto;
                })
                .toList();
    }

    @Override
    public List<PlayerDetailsDto> getPlayersOf(String teamLabel) {
        return teamDetailsList.stream()
                .filter(teamDetails -> teamDetails.getLabel().equals(teamLabel))
                .map(teamDetails -> {
                   return teamDetails.getPlayers().stream()
                            .map(playerDetails -> {
                                PlayerDetailsDto playerDetailsDto = new PlayerDetailsDto();
                                playerDetailsDto.setPlayerName(playerDetails.getName());
                                playerDetailsDto.setRole(playerDetails.getRole());
                                playerDetailsDto.setAmount(playerDetails.getAmount());
                                playerDetailsDto.setLabel(teamDetails.getLabel());
                                playerDetailsDto.setTeamName(teamDetails.getName());
                                return playerDetailsDto;
                   }).toList();
                }).flatMap(List::stream).toList();
    }

    @Override
    public TeamRoleAmountStatsDto getTeamRoleAmountStats(String teamLabel, String roleName) {
        return null;
    }

    @Override
    public List<TopPaidPlayerDto> getTopPaidPlayersOfEachTeam() {
        return null;
    }

    @Override
    public List<PlayerDetailsDto> getTopPaidPlayersOf(String role) {
        return null;
    }

    @Override
    public List<PlayerDetailsDto> getPlayers() {
        return null;
    }

    @Override
    public List<TeamStatsDto> getTeamStats() {
        return null;
    }
}
