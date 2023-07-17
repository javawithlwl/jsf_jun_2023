package com.careerit.jsf.cj.basics.day22;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
class Player {
    private long id;
    private String name;
    private String role;
    private String country;
    private double amount;
    private String team;
}

public class SetExample3 {

    public static void main(String[] args) {

        List<Player> players = loadFromFiles();

//        Set<String> countryName = new HashSet<>();
//        for (Player player : players) {
//            countryName.add(player.getCountry());
//        }
        Set<String> countryNames = players.stream().map(Player::getCountry).collect(Collectors.toSet());
        System.out.println(countryNames);
    }

    private static List<Player> loadFromFiles() {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Player>> typeReference = new TypeReference<>() {
        };
        try {
            return mapper.readValue(SetExample3.class.getResourceAsStream("/teams.json"), typeReference);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return List.of();
    }
}
