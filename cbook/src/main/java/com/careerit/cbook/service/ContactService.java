package com.careerit.cbook.service;

import com.careerit.cbook.dto.ContactDto;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface ContactService {

        ContactDto addContact(ContactDto contactDto);
        ContactDto updateContact(ContactDto contactDto);
        String updateContact(UUID id, Map<String,Object> updateMap);
        ContactDto deleteContact(UUID id);
        ContactDto getContact(UUID id);
        List<ContactDto> getAllContacts();
        List<ContactDto> search(String str);
        long addContacts(List<ContactDto> contactDtoList);
}
