package com.example.contact;

import com.example.contact.model.Contact;
import com.example.contact.repository.ContactRepository;
import com.example.contact.service.ContactService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTests {

    ContactRepository repo = Mockito.mock(ContactRepository.class);
    ContactService service = new ContactService(repo);

    @Test
    void testCreateContact() {
        Contact c = new Contact();
        c.setName("John");

        Mockito.when(repo.save(c)).thenReturn(c);

        Contact result = service.create(c);

        assertEquals("John", result.getName());
    }

    @Test
    void testGetById() {
        Contact c = new Contact();
        c.setName("Sam");

        Mockito.when(repo.findById(1L)).thenReturn(Optional.of(c));

        Contact result = service.getById(1L);

        assertEquals("Sam", result.getName());
    }
}
    
