package Lesson9;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mainClassHw9 {
    public static void main(String[] args) {
        List <Student> students = new ArrayList<>();
        students.addAll(Arrays.asList(new Student("Bob", Courses.MATH)
                ,new Student("Alan",Courses.MATH)
                ,new Student("Jake",Courses.GEOGRAPHY)
                ,new Student("Finn",Courses.BIOLOGY)));

        //1. Написать функцию, принимающую список Student и возвращающую список уникальных курсов,
        // на которые подписаны студенты.
        students.stream().map(s -> s.getCourses()).collect(Collectors.toSet()).forEach(System.out::println);

        //2. Написать функцию, принимающую на вход список Student и возвращающую список из трех
        // самых любознательных (любознательность определяется количеством курсов).
        students.stream().sorted(((o1, o2) -> o2.getCourses().compareTo(o1.getCourses())))
                .collect(Collectors.toSet()).stream().skip(students.size() -1)
                .collect(Collectors.toSet()).stream().forEach(System.out::println);

        //3.Написать функцию, принимающую на вход список Student и экземпляр Course,
        // возвращающую список студентов, которые посещают этот курс.
        students.stream().filter(student -> student.getCourses() ==
                Courses.BIOLOGY).collect(Collectors.toSet()).forEach(System.out::println);
    }
}