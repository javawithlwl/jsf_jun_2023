package com.careerit.jsf.cj.basics.iplstats.dto;


import lombok.Builder;

@Builder
public record PlayerDetailsDto(String label, String teamName, String playerName, String role, double amount) { }
