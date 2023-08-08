package com.careerit.cbook.service;

import com.careerit.cbook.domain.Contact;
import com.careerit.cbook.dto.ContactDto;
import com.careerit.cbook.repo.ContactRepo;
import com.careerit.cbook.util.Convertor;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class ContactServiceImpl implements ContactService {

    private final ContactRepo contactRepo;

    @Override
    public ContactDto addContact(ContactDto contactDto) {
        Assert.notNull(contactDto.getName(), "Name can't be null");
        Assert.notNull(contactDto.getMobile(), "Mobile can't be null");
        Contact contact = Convertor.convert(contactDto, Contact.class);
        contact = contactRepo.save(contact);
        contactDto = Convertor.convert(contact, ContactDto.class);
        return contactDto;
    }

    @Override
    public ContactDto updateContact(ContactDto contactDto) {
        return null;
    }

    @Override
    public ContactDto deleteContact(UUID id) {
        return null;
    }

    @Override
    public ContactDto getContact(UUID id) {
        return null;
    }

    @Override
    public List<ContactDto> getAllContacts() {
        List<ContactDto> contactDtoList = contactRepo.findAll().stream()
                                                      .map(contact -> Convertor.convert(contact, ContactDto.class))
                                                      .toList();
        log.info("Contact count is : {}",contactDtoList.size());
        return contactDtoList;
    }

    @Override
    public List<ContactDto> search(String str) {
        return null;
    }

    @Override
    public long addContacts(List<ContactDto> contactDtoList) {
            List<Contact> contactList = contactDtoList.stream().map(contactDto -> Convertor.convert(contactDto, Contact.class))
                    .toList();
            contactList = contactRepo.saveAll(contactList);
            return contactList.size();
    }
}
