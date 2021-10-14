import java.util.Random;

public class Designer extends  Employee{
    double rate;
    int workedDays;

    public Designer(int id, String name, int age, double salary, boolean gender, double rate, int workedDays) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.rate = rate;
        this.workedDays = workedDays;

    }

    @Override
    public String toString() {
        return super.toString() +
                ", rate= " + rate +
                ", workedDays= " + workedDays +
                ". " ;
    }

    public double getTotalSalary() {
        return salary + rate*workedDays;
    }
}
