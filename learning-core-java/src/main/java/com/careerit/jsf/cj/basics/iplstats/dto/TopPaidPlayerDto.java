package com.careerit.jsf.cj.basics.iplstats.dto;

import lombok.*;

import java.util.List;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TopPaidPlayerDto {

        private String teamLabel;
        private List<PlayerDetailsDto> players;
}
