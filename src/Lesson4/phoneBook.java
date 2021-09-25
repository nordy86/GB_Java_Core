package Lesson4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class phoneBook {

    private Map<String, HashSet<String>> telBook;

    phoneBook() {
        this.telBook=new HashMap<>();
    }

    void add(String lastName, String phoneNumber){
        HashSet<String> numbers;

        if (telBook.containsKey(lastName)) {
            numbers = telBook.get(lastName);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phoneNumber);
        telBook.put(lastName,numbers);
    }

    Set<String> get(String lastName) {
        return telBook.get(lastName);
    }
}
