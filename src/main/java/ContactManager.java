import java.util.ArrayList;
import java.util.List;

class ContactManager {
    private List<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // Other methods like search will be implemented here in the future
}