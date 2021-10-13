public class Test {
    public static void main(String[] args){

        EmployeeService employeeService = new EmployeeService();
        //Test for print Employers
        System.out.println("Test for print Employers");
        employeeService.printEmployees();
        System.out.println("=====================================");
        System.out.println();
        // Test for calculate Salary and Bonus
        System.out.println("Test for calculate Salary and Bonus");
        System.out.println(employeeService.calculateSalaryAndBonus());
        System.out.println("=====================================");
        System.out.println();
        // Test get by id
        System.out.println("Test get by id");
        try {
            System.out.println(employeeService.getById(12346).name);
        }
        catch (NullPointerException e){
           System.out.println("ID don`t exist.");
        }
        System.out.println("=====================================");
        System.out.println();
        // Test get by name
        System.out.println("Test get by name");
        System.out.println(employeeService.getByName("Tolik")[0].name);
        System.out.println("=====================================");
        System.out.println();
        //Test sort by name
        System.out.println("Test sort by name");
        Employee[] employees = employeeService.sortByName();
        for (Employee employee : employees) {
            System.out.println(employee.name);
        }
        System.out.println("=====================================");
        System.out.println();
        //Test sort by name and Salary
        System.out.println("Test sort by name and Salary");
        employees = employeeService.sortByNameAndSalary();
        for (Employee employee : employees) {
            System.out.println("Name is " + employee.name + ", salary is " + employee.salary);
        }
        System.out.println("=====================================");
        System.out.println();
        // Test edit
        System.out.println("Test edit");
        Employee employee = new Employee((long)1, "Orest", 28, 4000.0,true, 1,0);
        employeeService.edit(employee);
        System.out.println(employeeService.getById(1).name);
        System.out.println("=====================================");
        System.out.println();
        // Test remove
        System.out.println("Test remove");
        employeeService.remove(12346);
        try {
            System.out.println(employeeService.getById(12346).name);
        }
        catch (NullPointerException e){
            System.out.println("ID don`t exist.");
        }
        System.out.println("=====================================");
        System.out.println();

    }



}
