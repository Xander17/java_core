package collections.phonebook;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Phonebook {
    private Map<String, HashSet<String>> phonebook;

    public Phonebook() {
        phonebook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        lastName = lastName.toLowerCase();
        if (phonebook.containsKey(lastName))
            phonebook.get(lastName).add(phoneNumber);
        else {
            HashSet<String> set = new HashSet<>();
            set.add(phoneNumber);
            phonebook.put(lastName.toLowerCase(), set);
        }
    }

    public void get(String lastName) {
        lastName = lastName.toLowerCase();
        if (phonebook.containsKey(lastName)) {
            for (String number : phonebook.get(lastName)) {
                System.out.println(number);
            }
        } else System.out.println("В телефонной книге нет записей с такой фамилией");
    }
}
