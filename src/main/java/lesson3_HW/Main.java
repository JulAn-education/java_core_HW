package lesson3_HW;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws ParseException {



        Employee employee1 = new Employee("Tom",
                new SimpleDateFormat("yyyy-MM-dd").parse("1997-02-10"), 1600);
        Employee employee2 = new Employee("Rick",
                new SimpleDateFormat("yyyy-MM-dd").parse("1992-12-17"), 1500);
        Employee employee3 = new Employee("Jack",
                new SimpleDateFormat("yyyy-MM-dd").parse("1995-07-27"), 1800);
        Manager manager = new Manager("Oleg",
                new SimpleDateFormat("yyyy-MM-dd").parse("1991-11-25"), 3000);
        List<Employee> listEmployee = new ArrayList<>();
        listEmployee.add(employee1);
        listEmployee.add(employee2);
        listEmployee.add(employee3);
        listEmployee.add(manager);


        //System.out.println(employee1.getDate().after(employee2.getDate()));
        //System.out.println(employee1.compareTo(employee2));
        TreeSet<Employee> set = new TreeSet<>(listEmployee);
        set.forEach(System.out :: println);
        System.out.println();

        for (Employee employee : listEmployee) {
            Manager.upSalary(employee);
            System.out.println(employee);

        }

    }

}
