import java.util.Random.*;


public class Employee {


    public int id;
    public String name;
    public int age;
    public double salary;
    boolean gender;


    public Employee( ) {

    }

    public Employee(int id, String name, int age, double salary, boolean gender, int fixedBugs, int defaultBugRate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;

    }

    @Override
    public String toString() {
        if(gender){
            return
                    "id= " + id +
                            ", name= " + name +
                            ", age= " + age +
                            ", salary= " + salary +
                            ", gender= man";
        }
        else {
            return  "id= " + id +
                    ", name= " + name +
                    ", age= " + age +
                    ", salary= " + salary +
                    ", gender= woman";
        }

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double countFinalSalary(Employee employee){
        return  0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isGender() {
        return gender;
    }

    public double getTotalSalary() {
        return salary;
    }
}
