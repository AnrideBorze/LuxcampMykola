public class Test {
    public static void main(String[] args){

        EmployeeService employeeService = new EmployeeService();
        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeService.employees = (Employee[]) employeeFactory.generateEmployees(20);



        employeeService.printEmployees();

        employeeService.add(employeeService.remove(5));
        employeeService.printEmployees();


        //employeeService.calculateSalaryAndBonus();
        //System.out.println(employeeService.employees[3].getTotalSalary());
        //employeeService.employees[3].getTotalSalary();


    }



}
