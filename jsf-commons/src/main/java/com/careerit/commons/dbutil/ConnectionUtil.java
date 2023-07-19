package com.careerit.commons.dbutil;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public final class ConnectionUtil {

        private static Properties properties;

        static{
                properties = new Properties();
            try {
                properties.load(ConnectionUtil.class.getResourceAsStream("/db.properties"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        private ConnectionUtil(){
        }

        public static Connection getConnection(){
            Connection con = null;
            try{
                String url = properties.getProperty("db.url");
                String username = properties.getProperty("db.username");
                String password = properties.getProperty("db.password");
                con = DriverManager.getConnection(url,username,password);
            }catch (SQLException e){
                e.printStackTrace();
            }
            return con;
        }
        public static void close(Statement st,Connection con){
            close(st,null,con);
        }
        public static void close(Statement st, ResultSet rs, Connection con){
            try{
                if(rs != null){
                    rs.close();
                }
                if(st != null){
                    st.close();
                }
                if(con != null){
                    con.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
}
