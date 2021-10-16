import java.util.Arrays;
import java.util.NoSuchElementException;

public class EmployeeService {
    Employee[] employees = EmployeeFactory.generateEmployees(10);

    void printEmployees(){
        try {
            for (Employee employee: employees) {
                System.out.println(employee.toString());
            }
        }
        catch (NullPointerException e){
            System.out.println("There is null employer");
        }

    }

    double calculateSalaryAndBonus(){
        double sum = 0;
        for (Employee employee : employees) {
            sum+=employee.getTotalSalary();
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
                count++;
            }
        }
        return foundedEmployess;    }

    void sortByName() {
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
        employees = sortedEmployee;
    }

    void  sortByNameAndSalary(){
        sortByName();
        for (int i =0; i< employees.length;i++){
            for (int j =1; j < employees.length; j++){
                if(employees[i].name.equals(employees[j].name)&&employees[i].salary<employees[j].salary){
                    Employee employee = employees[i];
                    employees[i] = employees[j];
                    employees[j] = employee;
                }
            }
        }

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
        return employer;}

    Employee remove(long id){
        Employee removedEmployer = null;

        int counter = 0;
        for (int i =0; i< employees.length; i++) {
            if (employees[i].id == id) {
                removedEmployer = employees[i];
                employees[i] = null;
                counter = i;
            }
        }
        int counter2 = 0;
        int index =0;
        Employee[] newEmployer = new Employee[employees.length-1];
        for (Employee employee : employees) {
            if(counter!=counter2){
                newEmployer[index] = employee;
                counter2++;
                index++;
            }
            else {
                counter2++;
            }

        }
        employees=newEmployer;


        return  removedEmployer;
    }

    void add(Employee employee){
        Employee[] newEmployer = new Employee[employees.length+1];
        for (int i = 0; i < newEmployer.length-1; i++) {
            newEmployer[i] = employees[i];
        }
        newEmployer[newEmployer.length-1] = employee;
        employees = newEmployer;
    }
}
