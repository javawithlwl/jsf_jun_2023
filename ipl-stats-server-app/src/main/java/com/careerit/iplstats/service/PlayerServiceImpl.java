package com.careerit.iplstats.service;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.dto.PlayerDto;
import com.careerit.iplstats.repo.PlayerRepo;
import com.careerit.iplstats.util.MapperUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Slf4j
public class PlayerServiceImpl implements PlayerService{

    private final PlayerRepo playerRepo;
    @Override
    public List<PlayerDto> addPlayers(List<PlayerDto> playersDtoList) {
        Assert.notEmpty(playersDtoList, "Player list can't empty");
        log.info("Total players count is :{}",playersDtoList.size());
        List<Player> playersList = MapperUtil.convert(playersDtoList,new TypeReference<List<Player>>() {});
        playersList = playerRepo.saveAll(playersList);
        playersDtoList = MapperUtil.convert(playersList, new TypeReference<List<PlayerDto>>(){});
        log.info("Total {} players are added",playersDtoList.size());
        return playersDtoList;
    }

    @Override
    public List<PlayerDto> getPlayers(String teamName) {
        Assert.notNull(teamName,"Team name can't be null or empty");
        List<Player> players = playerRepo.findByTeamName(teamName);
        List<PlayerDto> playerDtoList = MapperUtil.convert(players, new TypeReference<List<PlayerDto>>() {});
        log.info("Team {} has {} player",teamName,playerDtoList.size());
        return playerDtoList;
    }
}
