package Lesson4;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> taskOneArr = new ArrayList<>(Arrays.asList("Java","Cat","Zoom","Laptop","Screen",
                                                                    "Table","Cat", "Dog","Banana","Box",
                                                                    "Rain","Night","Zoom","Time","Pillow"));

        System.out.println(taskOneArr);
//Считаем количество повторений
        Map<String, Integer> words = new HashMap<>();
        for (String s : taskOneArr) {
            words.put(s, words.getOrDefault(s, 0) + 1);
        }
        System.out.println(words);
//Печатаем уникальные значения
        Set<String> noRepeats = words.keySet();
        System.out.println(noRepeats);

//Создаем книгу, заносим данные, запрашиваем номера по фамилии
        phoneBook book = new phoneBook();
        book.add("Thompson","88005553535");
        book.add("Wilson","833353535");
        book.add("Wilson","99999");
        book.add("Nickson","8666665");

        System.out.println(book.get("Wilson"));

    }

}

