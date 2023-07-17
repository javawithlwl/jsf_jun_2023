package com.careerit.jsf.cj.basics.iplstats.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TeamDetails {

        private String name;
        private String city;
        private String coach;
        private String homeGround;
        private String label;

        private List<PlayerDetails> players;
}
