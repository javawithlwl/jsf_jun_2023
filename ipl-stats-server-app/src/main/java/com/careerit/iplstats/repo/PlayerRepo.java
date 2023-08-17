package com.careerit.iplstats.repo;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.dto.IPlayerDto;
import com.careerit.iplstats.dto.RoleCountStatsDto;
import com.careerit.iplstats.dto.TeamAmountStatsDto;
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
           select
                t.id as id,
              	t.name as name,
              	t.role as role,
              	t.team_name as teamName,
              	t.amount as amount from(
                select
              	   p.id,
              	   p.name,
              	   p.role,
              	   p.team_name,
              	   p.amount,
                   dense_rank() over (partition by p.role order by p.amount desc) as rnk
               from
              	 player_details p
               where
              	 p.team_name =:teamName) t where t.rnk=1
            """, nativeQuery = true) //NOSONAR
    List<IPlayerDto> getMaxPaidPlayers(@Param("teamName")String teamName);

    @Query("""
            select
            com.careerit.iplstats.dto.TeamAmountStatsDto(teamName,sum(amount))
            from Player group by teamName
            """)
    List<TeamAmountStatsDto> getTeamAmountStats();

    @Query("""
            select
            com.careerit.iplstats.dto.RoleCountStatsDto(teamName,count(*))
            from Player group by role
            """)
    List<RoleCountStatsDto> getRoleCountStats();
}
