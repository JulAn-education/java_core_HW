package lesson3_HW;

import java.util.Date;

// Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты,
// представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.

public class Employee implements Comparable<Employee>{


    private String name;
    private Date date;
    private int salary;

    public Employee(String name, Date date, int salary) {
        this.name = name;
        this.date = date;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public int getSalary(){
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        if (this.date.after(o.getDate())){
            return -1;
        } else if(this.date.before(o.date)){
            return 1;
        } else {
            return 0;
        }
    }
}


















