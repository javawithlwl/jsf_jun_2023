package com.careerit.cbook;

import com.careerit.cbook.dao.ContactDao;
import com.careerit.cbook.dao.ContactDaoImpl;
import com.careerit.cbook.domain.Contact;

public class Manager {

    public static void main(String[] args) {
        ContactDao contactDao = new ContactDaoImpl();
        Contact contact = new Contact();
        contact.setFirstName("Krish");
        contact.setLastName("Naik");
        contact.setEmail("krish.n@gmail.com");
        contact.setMobile("9999999999");
        contact.setCity("Hyderabad");
        contact = contactDao.insertContact(contact);
        System.out.println("Contact is inserted with id :"+contact.getId());
    }
}
