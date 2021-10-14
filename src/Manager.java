import java.util.Random;

public class Manager extends Employee{




    public Manager(int id, String name, int age, double salary, boolean gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }


    @Override
    public String toString() {
        return super.toString() + ".";
    }
}
