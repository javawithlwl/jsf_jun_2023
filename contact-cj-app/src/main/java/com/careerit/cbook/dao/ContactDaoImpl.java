package com.careerit.cbook.dao;

import com.careerit.cbook.domain.Contact;
import com.careerit.cbook.exceptions.ContactException;
import com.careerit.cbook.exceptions.ContactNotFoundException;
import com.careerit.commons.dbutil.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContactDaoImpl implements ContactDao {


    @Override
    public Contact insertContact(Contact contact) {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            con = ConnectionUtil.getConnection();
            st = con.prepareStatement(DbQueries.ADD_CONTACT, new String[]{"id"});
            st.setString(1, contact.getFirstName());
            st.setString(2, contact.getLastName());
            st.setString(3, contact.getEmail());
            st.setString(4, contact.getMobile());
            st.setString(5, contact.getCity());
            int count = st.executeUpdate();
            if (count == 1) {
                rs = st.getGeneratedKeys();
                if (rs.next()) {
                    contact.setId(rs.getLong(1));
                }
            } else {
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
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        List<Contact> contactList = new ArrayList<>();
        try {
            con = ConnectionUtil.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(DbQueries.SELECT_CONTACTS);
            while (rs.next()) {
                Contact contact = rowToContact(rs);
                contactList.add(contact);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(st, rs, con);
        }
        return contactList;

    }

    @Override
    public Contact selectContact(long id) {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            con = ConnectionUtil.getConnection();
            st = con.prepareStatement(DbQueries.SELECT_CONTACT_BY_ID);
            st.setLong(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                return rowToContact(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(st, rs, con);
        }
        throw new ContactNotFoundException("Contact with id :" + id + " is not found");
    }

    @Override
    public Contact updateContact(Contact contact) {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            con = ConnectionUtil.getConnection();
            st = con.prepareStatement(DbQueries.UPDATE_CONTACT);
            st.setString(1, contact.getFirstName());
            st.setString(2, contact.getLastName());
            st.setString(3, contact.getEmail());
            st.setString(4, contact.getMobile());
            st.setString(5, contact.getCity());
            st.setLong(6, contact.getId());
            int count = st.executeUpdate();
            if (count != 1) {
                throw new ContactException("Update contact failed, please check the id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(st, rs, con);
        }
        return contact;
    }

    @Override
    public boolean deleteContact(long id) {
        Connection con = null;
        PreparedStatement st = null;
        try {
            con = ConnectionUtil.getConnection();
            st = con.prepareStatement(DbQueries.DELETE_CONTACT);
            st.setLong(1, id);
            int count = st.executeUpdate();
            if (count == 1) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(st, con);
        }
        return false;
    }


    @Override
    public List<Contact> search(String str) {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        List<Contact> contactList = new ArrayList<>();
        try {
            con = ConnectionUtil.getConnection();
            st = con.prepareStatement(DbQueries.SEARCH_CONTACT);
            str = "%" + str + "%";
            st.setString(1, str);
            st.setString(2, str);
            st.setString(3, str);
            st.setString(4, str);
            st.setString(5, str);
            rs = st.executeQuery();
            while (rs.next()) {
                Contact contact = rowToContact(rs);
                contactList.add(contact);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(st, rs, con);
        }
        return contactList;
    }

    private Contact rowToContact(ResultSet rs) throws SQLException {
        long id = rs.getLong("id");
        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        String email = rs.getString("email");
        String mobile = rs.getString("mobile");
        String city = rs.getString("city");
        boolean deleted = rs.getBoolean("deleted");
        return Contact.builder()
                .id(id)
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .mobile(mobile)
                .city(city)
                .deleted(deleted)
                .build();
    }
}
