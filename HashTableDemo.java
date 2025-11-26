package java1;

/**
 * HashtableDemo: Demonstrates the basic usage of the Hashtable class
 * to store and retrieve data using Key-Value pairs.
 */
import java.util.Hashtable;
import java.util.Enumeration;

public class HashTableDemo {

    public static void main(String[] args) {
        
        // 1. Create a Hashtable
        // Keys are String (Employee ID), Values are String (Employee Name)
        Hashtable<String, String> employees = new Hashtable<>();

        System.out.println("--- Java Hashtable Demonstration ---");

        // 2. Inserting Key-Value Pairs using put()
        employees.put("E101", "Alice Johnson");
        employees.put("E102", "Bob Williams");
        employees.put("E103", "Charlie Smith");

        System.out.println("Current Hashtable: " + employees);

        // 3. Retrieving a Value using get(Key)
        String employeeIdToFind = "E102";
        String employeeName = employees.get(employeeIdToFind);
        System.out.println("\nEmployee Name for ID " + employeeIdToFind + ": " + employeeName);

        // 4. Checking if a Key exists using containsKey()
        String newId = "E104";
        if (!employees.containsKey(newId)) {
            System.out.println("ID " + newId + " is available for new employee.");
        }

        // 5. Removing a Key-Value Pair using remove(Key)
        String removedName = employees.remove("E101");
        System.out.println("Removed employee: " + removedName);
        System.out.println("Hashtable after removal: " + employees);

        // 6. Iterating through Keys and Values (using Enumeration - traditional way)
        System.out.println("\n--- Iterating over Employees ---");
        Enumeration<String> keys = employees.keys();

        while (keys.hasMoreElements()) {
        	String id = keys.nextElement();
        	String name = employees.get(id);
            System.out.println("ID: " + id + ", Name: " + name);
        }
    }
}
