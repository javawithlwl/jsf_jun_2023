package com.careerit.iplstats.controller;

import com.careerit.iplstats.dto.PlayerDto;
import com.careerit.iplstats.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/player")
@RequiredArgsConstructor
public class PlayerController {

    private final PlayerService playerService;

    @PostMapping("/add-players")
    public ResponseEntity<List<PlayerDto>> addPlayers(@RequestBody List<PlayerDto> playerDtoList) {
        List<PlayerDto> players = playerService.addPlayers(playerDtoList);
        return ResponseEntity.ok(players);
    }

    @GetMapping("/{teamName}")
    public ResponseEntity<List<PlayerDto>> getPlayers(@PathVariable String teamName) {
        List<PlayerDto> players = playerService.getPlayers(teamName);
        return ResponseEntity.ok(players);
    }

}
