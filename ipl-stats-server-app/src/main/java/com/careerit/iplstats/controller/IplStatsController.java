package com.careerit.iplstats.controller;

import com.careerit.iplstats.dto.MaxPaidPlayerDto;
import com.careerit.iplstats.dto.TeamStatsDto;
import com.careerit.iplstats.service.IplStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/stats")
public class IplStatsController {
        @Autowired
        private IplStatsService iplStatsService;
        @GetMapping("/team-names")
        public ResponseEntity<List<String>> getTeamNames(){
            return ResponseEntity.ok(iplStatsService.getTeamNames());
        }

        @GetMapping("/team-stats/{name}")
        public ResponseEntity<TeamStatsDto> getTeamStats(@PathVariable("name") String teamName){
                return  ResponseEntity.ok(iplStatsService.getTeamStats(teamName));
        }

        @GetMapping("/max-paid-players/{name}")
        public ResponseEntity<MaxPaidPlayerDto> getMaxPaidPlayers(@PathVariable("name")String teamName){
                return ResponseEntity.ok(iplStatsService.getMaxPaidPlayers(teamName));
        }

}
