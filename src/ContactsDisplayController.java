/**
 * Created by nilajapatankar on 6/6/14.
 */
public class ContactsDisplayController implements IContactsDisplayController {
    @Override
    public void DisplayContact(String[] contactNames) {
        System.out.println("Contacts:");
        for (String contactName : contactNames) {
            System.out.println(contactName);
        }
    }

    public void GenerateContactList() {
        String[] contacts = new String[]{
            "A","Z","C","p"
        };
        DisplayContact(contacts);
        Sorter sorter = new Sorter(this,contacts);
        System.out.println("After Sorting");
        sorter.Sort();
    }
}
