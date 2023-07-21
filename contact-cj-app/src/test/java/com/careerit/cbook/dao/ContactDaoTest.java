package com.careerit.cbook.dao;


import com.careerit.cbook.domain.Contact;
import com.careerit.cbook.exceptions.ContactNotFoundException;
import com.careerit.commons.dbutil.ConnectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

public class ContactDaoTest {

    ContactDao contactDao;

    @BeforeEach
    public void init() {
        cleanUpData();
        contactDao = new ContactDaoImpl();
    }

    @Test
    void insertContactTest() {
        Contact contact = getContact();
        Contact insertedContact = contactDao.insertContact(contact);
        Assertions.assertTrue(insertedContact.getId() > 0);
    }
    @Test
    void selectContactsTest() {
        List<Contact> contactList = getContacts();
        contactList.forEach(contact -> contactDao.insertContact(contact));
        List<Contact> selectList = contactDao.selectContacts();
        Assertions.assertEquals(contactList.size(), selectList.size());
    }

    @Test
    void selectContactByIdTest() {
        Contact contact = getContact();
        Contact insertedContact = contactDao.insertContact(contact);
        Contact contactById = contactDao.selectContact(insertedContact.getId());
        Assertions.assertEquals(insertedContact.getId(), contactById.getId());
    }

    @Test
    void selectContactNonExistingIdTest() {
        Contact contact = getContact();
        Contact insertedContact = contactDao.insertContact(contact);
        Assertions.assertThrows(ContactNotFoundException.class,()->contactDao.selectContact(-1L));
    }

    @Test
    void updateContactTest() {
        Contact contact = getContact();
        Contact insertedContact = contactDao.insertContact(contact);
        insertedContact.setCity("Bangalore");
        Contact updatedContact = contactDao.updateContact(insertedContact);
        Assertions.assertEquals("Bangalore", updatedContact.getCity());
    }

    @Test
    void deleteContactTest() {
        Contact contact = getContact();
        Contact insertedContact = contactDao.insertContact(contact);
        boolean isDeleted = contactDao.deleteContact(insertedContact.getId());
        Assertions.assertTrue(isDeleted);
    }

    @Test
    void deleteContactNonExistingIdTest() {
        Contact contact = getContact();
        Contact insertedContact = contactDao.insertContact(contact);
        Assertions.assertFalse(contactDao.deleteContact(-1L));
    }

    @Test
    void searchTest() {
        List<Contact> contactList = getContacts();
        contactList.forEach(contact -> contactDao.insertContact(contact));
        List<Contact> searchList = contactDao.search("Hyderabad");
        Assertions.assertEquals(2, searchList.size());
    }

    private Contact getContact() {
        return Contact.builder()
                .firstName("Krish")
                .lastName("T")
                .email("krish.t@gmail.com")
                .mobile("9876543210")
                .city("Hyderabad")
                .build();
    }

    private List<Contact> getContacts() {
        return List.of(
                Contact.builder()
                        .firstName("Krish")
                        .lastName("T")
                        .email("krish.t@gmail.com")
                        .mobile("9876543210")
                        .city("Hyderabad").build(),
                Contact.builder()
                        .firstName("Manoj")
                        .lastName("Kumar")
                        .email("manoj.kumar@gmail.com")
                        .mobile("9876543212")
                        .city("Hyderabad").build(),
                Contact.builder()
                        .firstName("Suresh")
                        .lastName("Kumar")
                        .email("suresh.k@gmail.com")
                        .mobile("9876543213")
                        .city("Bangalore").build());
    }

    private void cleanUpData() {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionUtil.getConnection();
            st = con.createStatement();
            st.executeUpdate("delete from contact");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionUtil.close(st, con);
        }
    }

}
