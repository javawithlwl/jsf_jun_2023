package com.careerit.iplstats.repo;

import com.careerit.iplstats.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepo extends JpaRepository<Player,Long> {

    List<Player> findByTeamName(String teamName);
}
