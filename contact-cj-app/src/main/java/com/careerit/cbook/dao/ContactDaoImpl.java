package com.careerit.cbook.dao;

import com.careerit.cbook.domain.Contact;
import com.careerit.commons.dbutil.ConnectionUtil;

import java.sql.*;
import java.util.List;

public class ContactDaoImpl implements ContactDao {


    @Override
    public Contact insertContact(Contact contact) {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            con = ConnectionUtil.getConnection();
            st = con.prepareStatement(DbQueries.ADD_CONTACT, new String[] { "id" });
            st.setString(1, contact.getFirstName());
            st.setString(2, contact.getLastName());
            st.setString(3, contact.getEmail());
            st.setString(4, contact.getMobile());
            st.setString(5, contact.getCity());
            int count = st.executeUpdate();
            if(count == 1) {
                rs = st.getGeneratedKeys();
                if (rs.next()) {
                    contact.setId(rs.getLong(1));
                }
            }else{
                System.out.println("Failed to insert the contact");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(st, con);
        }
        return contact;
    }

    @Override
    public List<Contact> selectContacts() {
        return null;
    }

    @Override
    public Contact updateContact(Contact contact) {
        return null;
    }

    @Override
    public boolean deleteContact(long id) {
        return false;
    }

    @Override
    public Contact selectContact(long id) {
        return null;
    }

    @Override
    public List<Contact> search(String str) {
        return null;
    }
}
