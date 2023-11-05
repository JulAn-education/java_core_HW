package lesson4_HW.task2;

public class Shopper {

       private String name;

       private int age;


    public Shopper(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shopper{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
