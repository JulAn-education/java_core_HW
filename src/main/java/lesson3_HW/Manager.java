package lesson3_HW;

import java.util.Date;

//Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты
//в класс руководителя, модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем,
//кроме руководителей. В основной программе создайте руководителя и поместите его в общий массив
//сотрудников. Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.

public class Manager extends Employee{


    public Manager(String name, Date date, int salary) {
        super(name, date, salary);
    }

    public static void upSalary(Employee employee){
        if (!(employee instanceof Manager)){
            employee.setSalary(employee.getSalary() +500);

        }
    }
}
