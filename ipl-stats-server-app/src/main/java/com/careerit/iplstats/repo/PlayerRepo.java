package com.careerit.iplstats.repo;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.dto.PlayerDto;
import com.careerit.iplstats.dto.TeamStatsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayerRepo extends JpaRepository<Player,Long> {

    List<Player> findByTeamName(String teamName);

    @Query("select distinct teamName from Player")
    List<String> getTeamNames();

    @Query("""
           select
             new com.careerit.iplstats.dto.TeamStatsDto(teamName,max(amount),min(amount),avg(amount),sum(amount))
             from Player where teamName=:teamName
             group by teamName
          """)
    TeamStatsDto getTeamStats(@Param("teamName") String teamName);

    @Query(value = """
             select new com.careerit.iplstats.dto.PlayerDto(
                t.id,
              	t.name,
              	t.role,
              	t.teamName,
              	t.amount) from(
              select
              	p.id,
              	p.name,
              	p.role,
              	p.teamName,
              	p.amount,
                dense_rank() over (partition by p.role
              order by
              	p.amount desc) as rnk
              from
              	Player p
              where
              	p.teamName =:teamName) t where t.rnk=1
            """,nativeQuery = true)
    List<PlayerDto> getMaxPaidPlayers(@Param("teamName")String teamName);
}
