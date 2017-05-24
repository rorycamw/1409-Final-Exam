import java.util.ArrayList;

/**
 * 1409 Final Exam
 * 
 * @author (Rory Woo)
 * @version (2017/04/05)
 */
public class AddressBook {
    // instance variables
    private String ownerName;
    private ArrayList<ContactInfo> contacts;

    /**
     * no-arg Constructor
     */
    public AddressBook() {
        ownerName = "unknown";
        contacts = new ArrayList<ContactInfo>();
    }
    
    /**
     * non-default constructor
     * 
     * @param newOwnerName
     */
    public AddressBook(String newOwnerName) {
        changeOwnerName(newOwnerName);
        contacts = new ArrayList<ContactInfo>();
    }
    
    /**
     * Method getOwnerName
     * 
     * return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }
    
    /**
     * Method getContacts
     * 
     * returns contacts
     */
    public ArrayList<ContactInfo> getContacts() {
        return contacts;
    }
    
    /**
     * Method changeOwnerName
     * 
     * @param newOwnerName to change ownerName
     */
    public void changeOwnerName(String newOwnerName) {
        if (newOwnerName != null && newOwnerName != "") {
            ownerName = newOwnerName;
        }
        else {
            ownerName = "unknown";
        }
    }
    
    /**
     * Method addContact
     * 
     * adds a new ContactInfo to contacts if not null
     */
    public void addContact(ContactInfo newContact) {
        if (!newContact.equals(null)) {
            contacts.add(newContact);
        }
        else {
            System.out.println("Error: Value cannot be null.");
        }
    }
    
    /**
     * Method findInfo
     * 
     * searches for a contact by name and displays info if found
     */
    public void findInfo(String findName) {
        if (!findName.equals(null)) {
            boolean nameFound = false;
            for(ContactInfo nameSearch : contacts) {
                if (nameSearch.getName().equalsIgnoreCase(findName)) {
                    nameFound = true;
                    nameSearch.displayDetails();
                }
            }
            if (nameFound == false) {
                System.out.println("Error: name not found.");
            }
        }
    }
    
    /**
     * Method removeContacts
     * 
     * searches contacts by city name in address and removes them from contacts of found
     */
    public void removeContacts(String citySearch) {
        if (!citySearch.equals(null)) {
            boolean cityFound = false;
            for(ContactInfo myCity : contacts) {
                if (myCity.getAddress().contains(citySearch)) {
                    cityFound = true;
                    contacts.remove(myCity);
                }
            }
            if (cityFound == false) {
                System.out.println("Error: city not found.");
            }
        }
    }
    
    /**
     * Method findSeniors
     * 
     * finds seniors in contacts
     */
    public int findSeniors() {
        int seniorsFound = 0;
        for(ContactInfo possibleSenior : contacts) {
            if (possibleSenior.isSenior() == true) {
                seniorsFound++;
            }
        }
        return seniorsFound;
    }
    
    /**
     * Method searchByAge
     * 
     * searches for contacts by age and displays all contacts details if older than inputted age
     */
    public void findInfo(int findAge) {
        if (findAge >= 0) {
            boolean ageFound = false;
            for(ContactInfo ageSearch : contacts) {
                if (ageSearch.getAge() > findAge) {
                    ageFound = true;
                    ageSearch.displayDetails();
                }
            }
            if (ageFound == false) {
                System.out.println("Error: no results found.");
            }
        }
    }
    
    /**
     * Method changeAddress
     * 
     * searches contacts by name and changes address to inputted value if found
     */
    public void changeAddress(String findName, String newAddress) {
        if (!findName.equals(null) && !newAddress.equals(null)) {
            boolean nameFound = false;
            for(ContactInfo nameSearch : contacts) {
                if (nameSearch.getName().equalsIgnoreCase(findName)) {
                    nameFound = true;
                    nameSearch.changeAddress(newAddress);
                }
            }
            if (nameFound == false) {
                System.out.println("Error: no results found.");
            }
        }
    }
    
    /**
     * Method displayAllInfo
     * 
     * outputs info of all contacts
     */
    public void displayAllInfo() {
        for(ContactInfo myContact : contacts) {
            myContact.displayDetails();
        }
    }
    
    /**
     * Method main
     * 
     * creates three cat objects to add to ArrayList using method addCat
     * calls method getCat with parameter 4
     * calls method displayAllCats
     * calls method removeCat on parameter 4
     * calls method removeCat on parameter 2
     * calls method displayAllCats
     */
    public static void main (String [] args) {
        AddressBook contacts = new AddressBook();
        ContactInfo contact1 = new ContactInfo("Annie", 62, "3333 W 18th Ave, Vancouver");
        ContactInfo contact2 = new ContactInfo("Rod", 24, "8888 75th Street, Surrey");
        ContactInfo contact3 = new ContactInfo("Lindsay", 5, "Canada Way, Burnaby");
        contacts.addContact(contact1);
        contacts.addContact(contact2);
        contacts.addContact(contact3);
        contacts.findInfo("Rod");
        contacts.findSeniors();
        contacts.changeAddress("Rod", "6666 97th Street, Burnaby");
        contacts.displayAllInfo();
        contacts.removeContacts("Burnaby");
        contacts.displayAllInfo();
    }
}