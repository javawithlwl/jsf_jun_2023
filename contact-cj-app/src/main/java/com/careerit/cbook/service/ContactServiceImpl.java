package com.careerit.cbook.service;

import com.careerit.cbook.domain.Contact;
import com.careerit.cbook.util.FileType;

import java.util.List;

public class ContactServiceImpl implements ContactService{
    @Override
    public Contact addContact(Contact contact) {
        return null;
    }

    @Override
    public List<Contact> getContacts() {
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
    public Contact getContact(long id) {
        return null;
    }

    @Override
    public List<Contact> search(String str) {
        return null;
    }

    @Override
    public void exportContacts(FileType fileType) {

    }

    @Override
    public void sendContacts(String email, FileType fileType) {

    }
}
