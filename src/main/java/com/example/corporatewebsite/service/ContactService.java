package com.example.corporatewebsite.service;

import com.example.corporatewebsite.model.Contact;
import com.example.corporatewebsite.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    private final ContactRepository repository;

    public ContactService(ContactRepository repository) {
        this.repository = repository;
    }

    public void saveContact(Contact contact) {
        repository.save(contact);
    }

    public List<Contact> getAllContacts() {
        return repository.findAll();
    }

}