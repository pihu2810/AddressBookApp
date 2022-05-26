package com.example.addressbook.controller;


import com.example.addressbook.dto.ContactDTO;
import com.example.addressbook.dto.ResponseDTO;
import com.example.addressbook.model.Contact;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    @RequestMapping(value = { "/get" })
    public ResponseEntity<ResponseDTO> getContactData() {

        Contact contact = null;
        contact= new Contact(1,
                new ContactDTO("Vishaka", "Kadam", "LB Nager", "TS", "HYD", "500035", "6887458934","vishu@123gmail.com"));
        ResponseDTO response = new ResponseDTO("Get call success", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);
    }


    @GetMapping("/get/{contactId}")
    public ResponseEntity<ResponseDTO> getContactData(@PathVariable("contactId") int contactId) {
        Contact contact = null;
        contact= new Contact(1,new ContactDTO("Shanvika", "J", "TNR", "Mumbai", "MH", "500056", "89559452825","shanvika@123gamil.com"));
        ResponseDTO response = new ResponseDTO("Get call success for id", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addContactData(@RequestBody ContactDTO contactDTO) {
        Contact contact = new Contact(1, contactDTO);
        ResponseDTO response = new ResponseDTO("Created contact data for", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }

    @PutMapping("/update/{contactId}")
    public ResponseEntity<ResponseDTO> updateContactData(@PathVariable("contactId") int contactId,
                                                         @RequestBody ContactDTO contactDTO) {
        Contact contact = new Contact(1, contactDTO);
        ResponseDTO response = new ResponseDTO("Updated contact data for", contact);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{contactId}")
    public ResponseEntity<ResponseDTO> deleteContactData(@PathVariable("contactId") int contactId) {
        ResponseDTO response = new ResponseDTO("Delete call success for id ", "deleted id:" + contactId);
        return new ResponseEntity<ResponseDTO>(response, HttpStatus.OK);

    }

}
