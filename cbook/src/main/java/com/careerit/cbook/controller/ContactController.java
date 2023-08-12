package com.careerit.cbook.controller;

import com.careerit.cbook.dto.ContactDto;
import com.careerit.cbook.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

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

    @PutMapping("/updatecontact")
    public ResponseEntity<ContactDto> updateContact(@RequestBody ContactDto contactDto) {
        return ResponseEntity.ok(contactService.updateContact(contactDto));
    }

    @PatchMapping("/{id}/updatecontact")
    public ResponseEntity<String> updateContact(@RequestBody Map<String,Object> updateMap,@PathVariable("id") UUID id) {
        return ResponseEntity.ok(contactService.updateContact(id,updateMap));
    }
    @GetMapping("/search")
    public ResponseEntity<List<ContactDto>> search(@RequestParam("str") String str){
        return ResponseEntity.ok(contactService.search(str));
    }


}
