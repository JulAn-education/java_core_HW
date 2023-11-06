package lesson5_HW;

import java.util.List;
import java.util.stream.DoubleStream;

public class Student implements Comparable<Student>{

    private String name;
    private List<Double> grades;
    private String specialty;

    public Student(String name, List<Double> grades, String specialty) {
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                ", specialty='" + specialty + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        double a = grades.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        double b = o.getGrades().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        if (a > b) {
            return -1;
        } else if (a < b) {
            return 1;
        } else {
            return 0;
        }
    }
}
