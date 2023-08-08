package com.careerit.cbook.controller;

import com.careerit.cbook.dto.ContactDto;
import com.careerit.cbook.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
@RequiredArgsConstructor
public class ContactController {

    private final ContactService contactService;

    @PostMapping("/addcontact")
    public ResponseEntity<ContactDto> addContact(@RequestBody ContactDto contactDto) {
        return ResponseEntity.ok(contactService.addContact(contactDto));
    }
    @GetMapping("/allcontacts")
    public ResponseEntity<List<ContactDto>> getAllContacts(){
        return ResponseEntity.ok(contactService.getAllContacts());
    }
    @PostMapping("/addcontacts")
    public ResponseEntity<Long> addContacts(@RequestBody List<ContactDto> contactDtoList){
        return ResponseEntity.ok(contactService.addContacts(contactDtoList));
    }
}
