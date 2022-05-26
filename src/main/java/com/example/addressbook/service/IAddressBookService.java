package com.example.addressbook.service;

import com.example.addressbook.dto.ContactDTO;
import com.example.addressbook.model.Contact;

import java.util.List;

public interface IAddressBookService
{
    List<Contact> getContact();

    Contact getContactById(int contactId);

    Contact createContact(ContactDTO contactDTO);

    Contact updateContact(int contactId, ContactDTO contactDTO);

    void deleteContact(int contactId);
}
