package com.careerit.cbook.dao;

import com.careerit.cbook.domain.Contact;

import java.util.List;

public interface ContactDao {

    Contact insertContact(Contact contact);

    List<Contact> selectContacts();

    Contact updateContact(Contact contact);

    boolean deleteContact(long id);

    Contact selectContact(long id);

    List<Contact> search(String str);
}
