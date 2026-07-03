package com.example.corporatewebsite.controller;

import com.example.corporatewebsite.model.Contact;
import com.example.corporatewebsite.service.ContactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
@CrossOrigin("*")
public class ContactController {

    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    @PostMapping
    public String saveContact(@RequestBody Contact contact) {

        service.saveContact(contact);

        return "Contact details submitted successfully.";

    }

    @GetMapping
    public List<Contact> getContacts() {

        return service.getAllContacts();

    }

}