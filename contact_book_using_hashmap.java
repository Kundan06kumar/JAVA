import java.util.HashMap;

public class ContactBook {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();

        contacts.put("Rahul", "9876543210");
        contacts.put("Aman", "9123456780");
        contacts.put("Rohit", "9988776655");

        String searchName = "Aman";

        if (contacts.containsKey(searchName)) {
            System.out.println(
                searchName + "'s number: " + contacts.get(searchName)
            );
        } else {
            System.out.println("Contact not found");
        }
    }
}
