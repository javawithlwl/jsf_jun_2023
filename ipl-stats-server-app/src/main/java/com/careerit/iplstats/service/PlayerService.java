package com.careerit.iplstats.service;

import com.careerit.iplstats.dto.PlayerDto;

import java.util.List;

public interface PlayerService {

    List<PlayerDto> addPlayers(List<PlayerDto> players);
    List<PlayerDto> getPlayers(String teamName);
}
