package com.careerit.iplstats.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class MaxPaidPlayerDto {

    private Map<String, List<PlayerDto>> maxPaidPlayers;
}
