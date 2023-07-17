package com.careerit.jsf.cj.basics.iplstats;

import com.careerit.jsf.cj.basics.iplstats.service.IplStatsService;
import com.careerit.jsf.cj.basics.iplstats.service.IplStatsServiceImpl;

public class IplStatsManager {

    public static void main(String[] args) {
            IplStatsService service = new IplStatsServiceImpl();
            System.out.println(service.getTeamLabels());
            System.out.println(service.getAllTeamAmountStats());
            System.out.println(service.getPlayersOf("CSK"));
    }
}
