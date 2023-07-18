package com.careerit.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcExample {

    private static final String URL = "jdbc:postgresql://dpg-chncg4u4dad1d51vem90-a.oregon-postgres.render.com:5432/jsf_may_2023";
    private static final String USERNAME = "dbuser";
    private static final String PASSWORD = "1HnWkrn3bIQUkkSfcnwk7gW8YW3nJIWy";

    public static void main(String[] args) {
        getPlayerNames().forEach(System.out::println);
    }

    private static List<String> getPlayerNames() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        List<String> namesList = new ArrayList<>();
        try {
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            st = con.createStatement();
            rs = st.executeQuery("select name from player");
            while (rs.next()) {
                String name = rs.getString("name");
                namesList.add(name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return namesList;
        }
    }

}
