package com.careerit.iplstats.service;

import com.careerit.iplstats.dto.*;
import com.careerit.iplstats.exceptions.IplStatsException;
import com.careerit.iplstats.repo.PlayerRepo;
import com.careerit.iplstats.util.MapperUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
public class IplStatsServiceImpl implements IplStatsService {
    @Autowired
    private PlayerRepo playerRepo;

    @Override
    public List<String> getTeamNames() {
        List<String> teamNamesList = playerRepo.getTeamNames();
        log.info("Teams count is :{}", teamNamesList.size());
        return teamNamesList;
    }

    @Override
    public TeamStatsDto getTeamStats(String teamName) {

        Assert.notNull(teamName, "Team name can't be null or empty");
        TeamStatsDto teamStats = playerRepo.getTeamStats(teamName);
        if (teamStats == null) {
            throw new IplStatsException("Invalid team name or team details are not found, team name is " + teamName);
        }
        log.info("Looking for stats of the team {}", teamName);
        return teamStats;
    }

    @Override
    public MaxPaidPlayerDto getMaxPaidPlayers(String teamName) {
        Assert.notNull(teamName, "Team name can't be null or empty");
        List<IPlayerDto> playerDtoList = playerRepo.getMaxPaidPlayers(teamName);
        if (CollectionUtils.isEmpty(playerDtoList)) {
            throw new IplStatsException("Invalid team name or team details are not found " + teamName);
        }
        log.info("Max paid players count {}",playerDtoList.size());

        Map<String, List<PlayerDto>> maxPaidPlayerList = playerDtoList.stream().
                map(ele->{
                    PlayerDto playerDto = new PlayerDto();
                    playerDto.setId(ele.getId());
                    playerDto.setName(ele.getName());
                    playerDto.setTeamName(ele.getTeamName());
                    playerDto.setAmount(ele.getAmount());
                    playerDto.setRole(ele.getRole());
                    return playerDto;
                }).collect(Collectors.groupingBy(PlayerDto::getRole));
        MaxPaidPlayerDto maxPaidPlayers = new MaxPaidPlayerDto();
        maxPaidPlayers.setMaxPaidPlayers(maxPaidPlayerList);
        return maxPaidPlayers;
    }

    @Override
    public List<TeamAmountStatsDto> getTeamAmountStats() {
        return playerRepo.getTeamAmountStats();
    }

    @Override
    public List<RoleCountStatsDto> getRoleCountStats() {
        return playerRepo.getRoleCountStats();
    }

    @Override
    public TeamStatsSummary getTeamStatsSummary(String teamName) {

        TeamStatsDto teamStatsDto = playerRepo.getTeamStats(teamName);
        List<PlayerDto> players = playerRepo
                .findByTeamName(teamName)
                .stream()
                .map(ele->MapperUtil.convert(ele,PlayerDto.class))
                .toList();
        MaxPaidPlayerDto maxPaidPlayerDto = getMaxPaidPlayers(teamName);

        TeamStatsSummary teamStatsSummary = TeamStatsSummary.builder()
                .teamStatsDto(teamStatsDto)
                .players(players)
                .maxPaidPlayerDto(maxPaidPlayerDto)
                .build();
        log.info("Team {} summary stats",teamName);
        return teamStatsSummary;


    }
}
