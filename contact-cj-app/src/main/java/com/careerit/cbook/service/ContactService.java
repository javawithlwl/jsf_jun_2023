package com.careerit.cbook.service;

import com.careerit.cbook.domain.Contact;
import com.careerit.cbook.util.FileType;

import java.util.List;

public interface ContactService {

    Contact addContact(Contact contact);

    List<Contact> getContacts();

    Contact updateContact(Contact contact);

    boolean deleteContact(long id);

    Contact getContact(long id);

    List<Contact> search(String str);

    void exportContacts(FileType fileType);

    void sendContacts(String email, FileType fileType);

}
