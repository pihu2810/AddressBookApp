package com.example.addressbook.service;


import com.example.addressbook.dto.ContactDTO;
import com.example.addressbook.model.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService
{
    @Override
    public List<Contact> getContact() {
        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact(1,
                new ContactDTO("Vishaka", "Kadam", "LB Nager", "TS", "HYD", "500035", "9743546574","vishu@123gmail.com")));
        System.out.println(contactList.toString());

        return contactList;
    }

    @Override
    public Contact getContactById(int contactId) {
        Contact contact = new Contact(1,
                new ContactDTO("Shanvika", "j", "TNR", "MH", "Mumbai", "500098", "86536553575","pihu@123"));
        return contact;
    }

    @Override
    public Contact createContact(ContactDTO contactDTO) {
        Contact contact = new Contact(1, contactDTO);
        return contact;
    }

    @Override
    public Contact updateContact(int contactId, ContactDTO contactDTO) {
        Contact contact = new Contact(1, contactDTO);
        return contact;
    }

    @Override
    public void deleteContact(int contactId) {
        // TODO Auto-generated method stub

    }

}
