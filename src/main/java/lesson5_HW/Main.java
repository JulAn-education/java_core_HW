package lesson5_HW;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

// Имеется список студентов. Каждый студент имеет имя, список оценок и специальность.
// Найдите первых 5 студентов специальности "Информатика" с средним баллом выше 4.5, отсортированных по убыванию среднего балла.
// В решении не использовать циклы! Только StreamAPI
public class Main {

    public static void main(String[] args) {


        List<Student> list = new ArrayList<>();
        list.add(new Student("Tom", List.of(4.0, 4.0, 5.0, 5.0, 5.0), "Информатика"));
        list.add(new Student("Rick", List.of(4.0, 4.0, 5.0, 5.0, 4.0), "История"));
        list.add(new Student("Timmy", List.of(5.0, 4.0, 5.0, 5.0, 5.0), "Информатика"));
        list.add(new Student("Oleg", List.of(5.0, 5.0, 4.0, 5.0, 5.0), "Информатика"));
        list.add(new Student("Egor", List.of(3.0, 4.0, 5.0, 3.0, 4.0), "Математика"));
        list.add(new Student("Igor", List.of(4.0, 4.0, 4.0, 3.0, 5.0), "История"));
        list.add(new Student("Alex", List.of(5.0, 5.0, 5.0, 3.0, 3.0), "Математика"));
        list.add(new Student("Tim", List.of(5.0, 5.0, 5.0, 4.0, 5.0), "Информатика"));
        list.add(new Student("Olga", List.of(5.0, 5.0, 5.0, 5.0, 5.0), "Информатика"));
        list.add(new Student("Anna", List.of(5.0, 5.0, 5.0, 5.0, 4.0), "Информатика"));
        list.add(new Student("Maria", List.of(5.0, 4.0, 5.0, 4.0, 4.0), "История"));

        list.stream().filter(student -> student.getSpecialty().equals("Информатика"))
                .filter(student ->
                        (student.getGrades().stream().flatMapToDouble(DoubleStream::of).average().orElse(0)) > 4.5)
                .sorted().limit(5).forEach(System.out::println);

    }



}
