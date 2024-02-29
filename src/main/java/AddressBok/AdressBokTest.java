package AddressBok;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class AdressBokTest {
    @Test
    public void testAddContact(){
        AdressBok adressBok = new AdressBok();
        Contact contact= new Contact("Zeynep","zeynep@com","0761112233");
        adressBok.addContact(contact);
        List<Contact> contacts = adressBok.getAllContacts();
        assertTrue(contacts.contains(contacts));
    }
    @Test
    public void testRemoveContact(){
        AdressBok adressBok = new AdressBok();
        Contact contact= new Contact("Zeynep","zeynep@com","0761112233");
        Contact contact1= new Contact("Zehra","zeynep@com","0761112233");
        adressBok.addContact(contact);
        adressBok.removeContact(contact);

        List<Contact> contacts = adressBok.getAllContacts();
        assertEquals(0,contacts.size());

        adressBok.addContact(contact);
        adressBok.addContact(contact1);
        adressBok.removeContact(contact1);
        adressBok.removeContact(contact1);
        assertEquals(1,contacts.size());
        
    }
    @Test
    public void testChangeContact(){
        AdressBok adressBok = new AdressBok();
        Contact contact= new Contact("Zeynep","zeynep@com","0761112233");
        adressBok.addContact(contact);
        adressBok.changeContactNumber(contact,"0238294834");

        List<Contact> contacts = adressBok.getAllContacts();
        assertEquals("0238294834",contacts.get(0).number);

    }
}
