package arraylist.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MobilePhoneTest {

    @Test
    void printContacts() {

        MobilePhone phone = new MobilePhone("90352322323");
        Contact name1 = new Contact("Name1", "+91 90435234345");
        Contact name2 = new Contact("Name2", "+91 89056745634");
        assertEquals(true, phone.addNewContact(name1));
        assertEquals(true, phone.addNewContact(name2));

        assertEquals("+91 90435234345", phone.queryContact("Name1").getPhoneNumber());

        assertEquals(true, phone.removeContact(name1));

        Contact name1Updated = new Contact("Name1Updated", "+23 93453453454");
        assertEquals(false, phone.updateContact(name1, name1Updated));

        Contact name2Updated = new Contact("Name2Updated", "+23 76543554645");
        assertEquals(true, phone.updateContact(name2, name2Updated));

        phone.addNewContact(new Contact("Vel", "+2 3453233"));
        assertEquals(false, phone.addNewContact(new Contact("Vel", "+2 3453233")));
        phone.printContacts();
    }
}