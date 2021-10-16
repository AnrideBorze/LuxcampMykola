public class Test {
    public static void main(String[] args){

        EmployeeService employeeService = new EmployeeService();
        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeService.employees = (Employee[]) employeeFactory.generateEmployees(20);



        // Test 1
        employeeService.printEmployees();
        System.out.println();
        System.out.println("=====================================");
        //Test 2
        System.out.println(employeeService.calculateSalaryAndBonus());
        System.out.println();
        System.out.println("=====================================");
        //Test 3
        System.out.println(employeeService.getById(5));
        System.out.println();
        System.out.println("=====================================");
        //Test 4
        Employee[] lookingForEmployer = employeeService.getByName("Ira");
        for (Employee employee : lookingForEmployer) {
            System.out.println(employee);
        }
        System.out.println();
        System.out.println("=====================================");
        //Test 5
        employeeService.sortByName();
        employeeService.printEmployees();
        System.out.println();
        System.out.println("=====================================");
        //Test 6
        employeeService.sortByNameAndSalary();
        employeeService.printEmployees();
        System.out.println();
        System.out.println("=====================================");
        //Test 7
        Employee employeeOne = new Employee(3,"Ira",24,2000,false);
        Employee employeeTwo = employeeService.edit(employeeOne);
        System.out.println(employeeTwo);
        System.out.println();
        employeeService.printEmployees();
        System.out.println();
        System.out.println();
        System.out.println("=====================================");
        // Test 8
        employeeService.add(employeeTwo);
        employeeService.printEmployees();
        System.out.println();
        System.out.println("=====================================");



        //employeeService.calculateSalaryAndBonus();
        //System.out.println(employeeService.employees[3].getTotalSalary());
        //employeeService.employees[3].getTotalSalary();


    }



}
