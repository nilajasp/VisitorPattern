/**
 * Created by nilajapatankar on 6/6/14.
 */
public class Sorter {

    IContactsDisplayController _contactList;
    String[] _contacts;
    public Sorter(IContactsDisplayController contactList, String[] contacts) {
        _contactList = contactList;
        _contacts = contacts;
    }

    public void Sort() {
        for (int i=0; i<_contacts.length;i++) {
            for(int j=i+1; j<_contacts.length;j++){
                if(_contacts[i].compareToIgnoreCase(_contacts[j]) > 0){
                    String tmp = _contacts[i];
                    _contacts[i] = _contacts[j];
                    _contacts[j] = tmp;
                }
            }
        }
        _contactList.DisplayContact(_contacts);
    }
}
