/**
 * 1409 Final Exam
 * 
 * @author (Rory Woo) 
 * @version (2017/04/05)
 */
public class ContactInfo {
    // instance variables
    private String name;
    private int age;
    private String address;

    /**
     * no-arg Constructor
     */
    public ContactInfo() {
        name = "unknown";
        age = 0;
        address = "unknown";
    }
    
    /**
     * non-default constructor
     * 
     * @param newName
     * @param newAge
     * @param newAddress
     */
    public ContactInfo(String newName, int newAge, String newAddress) {
        changeName(newName);
        changeAge(newAge);
        changeAddress(newAddress);
    }
    
    /**
     * Method changeName
     * 
     * @param newName to change name
     */
    public void changeName(String newName) {
        if (newName != null && newName != "") {
            name = newName;
        }
        else {
            name = "unknown";
        }
    }
    
    /**
     * Method changeAge
     * 
     * @param newAge to change age
     */
    public void changeAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        }
        else {
            age = 0;
        }
    }
    
    /**
     * Method changeAddress
     * 
     * @param newAddress to change address
     */
    public void changeAddress(String newAddress) {
        if (newAddress != null && newAddress!= "") {
            address = newAddress;
        }
        else {
            address = "unknown";
        }
    }
    
    /**
     * Method getName
     * 
     * returns name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Method getAge
     * 
     * returns age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Method getAddress
     * 
     * returns address
     */
    public String getAddress() {
        return address;
    }
    
    /**
     * Method isSenior
     * 
     * returns true if age >= 60 or returns false if age < 60
     */
    public boolean isSenior() {
        boolean isSenior = false;
        if (age >= 60) {
            isSenior = true;
        }
        else {
            isSenior = false;
        }
        return isSenior;
    }
    
    /**
     * Method displayDetails
     * 
     * outputs name, age, and address
     */
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}