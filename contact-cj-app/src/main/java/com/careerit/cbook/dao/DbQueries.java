package com.careerit.cbook.dao;

public final class DbQueries {

    public static final String ADD_CONTACT= "insert into contact(first_name,last_name,email,mobile,city) values(?,?,?,?,?)";
    public static final String SELECT_CONTACTS = "select id,first_name,last_name,email,mobile,city from contact where deleted = false";
    public static final String UPDATE_CONTACT = "update contact set first_name = ?,last_name = ?,email = ?,mobile = ?,city = ? where id = ?";
    public static final String DELETE_CONTACT = "update contact set deleted = true where id = ?";
    public static final String SELECT_CONTACT = "select id,first_name,last_name,email,mobile,city from contact where id = ?";

    public static final String SEARCH_CONTACT = """
              select id,first_name,last_name,email,mobile,city
                    from contact
                    where deleted = false and
                    (first_name like ? or last_name like ? or email like or mobile like ? or city like ?)""";

    public static  String format(String query){
        return query.stripIndent().replaceAll("\n"," ").replaceAll("\\s+"," ");
    }
}
