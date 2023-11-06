package arraylist.challenge;

import java.util.List;
import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private List<Contact> myContacts;
    
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }
    
    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) != null) {
            return false;
        }
        return myContacts.add(contact);
    }
    
    public boolean updateContact(Contact contact, Contact newContact) {
        int index = findContact(contact);
        if(index == -1) {
            return false;
        }
        myContacts.set(index, newContact);
        return true;
    } 
    public boolean removeContact(Contact contact) {
        return myContacts.remove(contact);
    }
    
    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }
    
    private Contact findContact(String name) {
        for(Contact contact: myContacts) {
            if(contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }
    
    public Contact queryContact(String name) {
        return findContact(name);
    }
    
    public void printContacts() {
        for(int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println(i+1 + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}