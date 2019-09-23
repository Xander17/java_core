package collections.phonebook;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private Map<String, String> phonebook;
    private final String separator = "_";

    public Phonebook() {
        phonebook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        int count = 0;
        while (phonebook.containsKey(lastNameEntryFormat(lastName, count))) count++;
        phonebook.put(lastNameEntryFormat(lastName, count), phoneNumber);
    }

    public void get(String lastName) {
        for (Map.Entry<String, String> entry : phonebook.entrySet()) {
            String key = entry.getKey();
            if (key.substring(0, key.indexOf(separator)).equalsIgnoreCase(lastName))
                System.out.println(entry.getValue());
        }
    }

    private String lastNameEntryFormat(String lastName, int count) {
        return lastName + separator + count;
    }
}
