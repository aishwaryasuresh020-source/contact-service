import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAddContact() {
        App.contacts.clear();

        App.addContact(new App.Contact(1, "Asha", "12345"));

        assertEquals(1, App.contacts.size());
    }

    @Test
    public void testUpdateContact() {
        App.contacts.clear();

        App.addContact(new App.Contact(1, "Asha", "12345"));
        App.updateContact(1, "New Name", "99999");

        assertEquals("New Name", App.contacts.get(0).name);
    }

    @Test
    public void testDeleteContact() {
        App.contacts.clear();

        App.addContact(new App.Contact(1, "Asha", "12345"));
        App.deleteContact(1);

        assertEquals(0, App.contacts.size());
    }
}
