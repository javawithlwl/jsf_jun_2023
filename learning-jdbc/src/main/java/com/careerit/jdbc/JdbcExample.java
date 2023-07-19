package com.careerit.jdbc;

import com.careerit.commons.dbutil.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JdbcExample {


    public static final String TEAM_NAMES = "select distinct team as team_name from player";
    public static final String PLAYER_NAMES = "select name from player";
    public static final String TOTAL_AMOUNT_OF_TEAM = "select team,sum(amount) as total_amount from player group by team order by total_amount desc";

    public static void main(String[] args) {
        getPlayerNames().forEach(System.out::println);
        System.out.println("--------------------------------------------------");
        System.out.println(getTotalAmountSpentByEachTeam());
        System.out.println("--------------------------------------------------");
        System.out.println(getTeamNames());
    }

    private static Map<String, Double> getTotalAmountSpentByEachTeam() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        Map<String, Double> map = new HashMap<>();
        try {
            con = ConnectionUtil.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(TOTAL_AMOUNT_OF_TEAM);
            while (rs.next()) {
                String team = rs.getString("team");
                double total = rs.getDouble("total_amount");
                map.put(team, total);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(st, rs, con);
        }
        return map;
    }

    private static List<String> getTeamNames() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        List<String> namesList = new ArrayList<>();
        try {
            con = ConnectionUtil.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(TEAM_NAMES);
            while (rs.next()) {
                String name = rs.getString("team_name");
                namesList.add(name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(st, rs, con);
        }
        return namesList;
    }

    private static List<String> getPlayerNames() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        List<String> namesList = new ArrayList<>();
        try {
            con = ConnectionUtil.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(PLAYER_NAMES);
            while (rs.next()) {
                String name = rs.getString("name");
                namesList.add(name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(st, rs, con);
        }
        return namesList;
    }

}
