public class Employee {


    public long id;
    public String name;
    public int age;
    public double salary;
    boolean gender;
    public int fixedBugs;
    public int defaultBugRate;

    public Employee( ) {

    }

    public Employee(long id, String name, int age, double salary, boolean gender, int fixedBugs, int defaultBugRate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.fixedBugs = fixedBugs;
        this.defaultBugRate = defaultBugRate;
        bagsBonus(this);
    }


    public void bagsBonus(Employee employee){
        if(employee.fixedBugs==0){
            employee.defaultBugRate= (int)(employee.salary*0.1);
        }
        else if(employee.fixedBugs<5){
            employee.defaultBugRate= (int)(employee.salary*0.1);
        }
        else if(employee.fixedBugs>5&&employee.fixedBugs<10){
            employee.defaultBugRate= (int)(employee.salary*0.2);
        }
        else {
            employee.defaultBugRate= (int)(employee.salary*0.25);
        }
    }


}
