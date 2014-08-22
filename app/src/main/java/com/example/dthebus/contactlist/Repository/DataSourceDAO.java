package com.example.dthebus.contactlist.Repository;

import com.example.dthebus.contactlist.domain.Contact;

import java.util.List;

/**
 * Created by dthebus on 2014/08/22.
 */
public interface DataSourceDAO {

    public void addContact(Contact contact);
    public Contact getContact(int id);
    public List<Contact> getAllContacts();
}
