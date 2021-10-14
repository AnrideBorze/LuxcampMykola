import java.util.Random;

public class Developer extends Employee{
    public int fixedBugs;

    public Developer(int id, String name, int age, double salary, boolean gender, int fixedBugs) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.fixedBugs = fixedBugs;

    }


    @Override
    public String toString() {
        return super.toString() +
                ", fixedBugs= " + fixedBugs + ".";
    }

    public double getTotalSalary() {
        Random random = new Random();
        return salary + (fixedBugs * 50)*(random.nextBoolean()?2:0);
    }


}
