import java.util.Arrays;
import java.util.NoSuchElementException;

public class EmployeeService {
    Employee[] employees = EmployeeFactory.generateEmployees(10);

    void printEmployees(){
        try {
            for (Employee employee: employees) {
                System.out.println("The employer id is " + employee.id + ", name is " + employee.name +
                        ", age " + employee.age + ", salary " +
                        employee.salary + ", this month he fixed " + employee.fixedBugs +
                        " bugs, and he has the " + employee.defaultBugRate + " bonus dollars for salary");
            }
        }
        catch (NullPointerException e){
            System.out.println("There is null employer");
        }

    }

    double calculateSalaryAndBonus(){
        double sum = 0;
        for (Employee employer: employees) {
            sum+= employer.salary+ employer.defaultBugRate;
        }
        return sum;
    }

    Employee getById(long id){
        for (Employee employee:employees) {
            if(employee.id == id){
                 return employee;
             }
        }
        return null;
    }
    Employee[] getByName(String name){
        int count = 0;
        for (Employee employee:employees) {
            if(employee.name.equals(name)){
                count++;
            }
        }
        if(count==0){
            return null;
        }
        Employee[] foundedEmployess = new Employee[count];
        count=0;
        for (Employee employee:employees) {
            if(employee.name.equals(name)){
                foundedEmployess[count]=employee;
            }
        }
        return foundedEmployess;    }

    Employee[] sortByName() {
        String[] names = new String[employees.length];
        Employee[] employeesCopy = employees.clone();
        int count = 0;
        for (Employee employee : employees) {
            names[count] = employee.name;
            count++;
        }
        count = 0;
        Employee[] sortedEmployee = new Employee[employees.length];
        Arrays.sort(names);
        for (int i =0; i< names.length;i++) {
            for (int j =0; j< employeesCopy.length;j++) {
                if (names[i].equals(employeesCopy[j].name)) {
                    sortedEmployee[count] = employeesCopy[j];
                    employeesCopy[j]=new Employee();
                    count++;

                }
            }
        }
        return sortedEmployee;
    }

    Employee[] sortByNameAndSalary(){
        Employee[] sortedEmployee = sortByName();
        for (int i =0; i< sortedEmployee.length;i++){
            for (int j =1; j < sortedEmployee.length; j++){
                if(sortedEmployee[i].name.equals(sortedEmployee[j].name)&&sortedEmployee[i].salary<sortedEmployee[j].salary){
                    Employee employee = sortedEmployee[i];
                    sortedEmployee[i] = sortedEmployee[j];
                    sortedEmployee[j] = employee;
                }
            }
        }
        return  sortedEmployee;

    }





    Employee edit(Employee employee){

        Employee employer = getById(employee.id);
        if(employer==null){
            throw new NoSuchElementException("There is no employer on this id");
        }
        for (int i =0; i< employees.length; i++){
            if(employees[i].id == employee.id){
                employees[i] = employee;
            }
        }
        return employee;}

    Employee remove(long id){
        Employee removedEmployer = null;
        for (int i =0; i< employees.length; i++){
            if(employees[i].id == id){
                removedEmployer = employees[i];
                employees[i] = null;
            }
        }

        return  removedEmployer;
    }
}
