package com.careerit.jsf.cj.basics.day21;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class IplStatsExample {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Player>> typeReference = new TypeReference<>() {};
        List<Player> players = objectMapper.readValue(IplStatsExample.class.getResourceAsStream("/teams.json"),typeReference);
        players.forEach(System.out::println);
        String jsonStr = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(players);
        System.out.println(jsonStr);
    }
}
