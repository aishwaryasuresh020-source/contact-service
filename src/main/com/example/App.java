import java.util.*;

public class App {

    static class Contact {
        int id;
        String name;
        String phone;

        Contact(int id, String name, String phone) {
            this.id = id;
            this.name = name;
            this.phone = phone;
        }
    }

    static List<Contact> contacts = new ArrayList<>();

    // CREATE
    public static void addContact(Contact c) {
        contacts.add(c);
    }

    // READ
    public static List<Contact> getContacts() {
        return contacts;
    }

    // UPDATE
    public static void updateContact(int id, String name, String phone) {
        for (Contact c : contacts) {
            if (c.id == id) {
                c.name = name;
                c.phone = phone;
            }
        }
    }

    // DELETE
    public static void deleteContact(int id) {
        contacts.removeIf(c -> c.id == id);
    }

    public static void main(String[] args) {

        addContact(new Contact(1, "Asha", "12345"));
        addContact(new Contact(2, "John", "67890"));

        System.out.println("All Contacts: " + getContacts().size());

        updateContact(1, "Asha Updated", "11111");

        deleteContact(2);

        System.out.println("Final Contacts: " + getContacts().size());
    }
}
