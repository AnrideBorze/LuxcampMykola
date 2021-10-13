public class EmployeeFactory {
    private static String[] names = {"Andrey", "Ivan", "Oleh", "Tolik", "Mikolay", "David", "Igor"};


 public static Employee[] generateEmployees(int size){
        Employee[] employees = new Employee[size];
        for (int i =0; i<size;i++){
            String name = names[(10+i)%7];
            int countBugs = (int)(Math.random()*10);
            boolean gender = makegender(i+1);
            Employee employee = new Employee((long)12345*i+1, name, 20 + i*2, 1000.0 + 100*i,gender, countBugs,0);
            employees[i] = employee;
}
        return  employees;
    }

   static boolean makegender (int number){
     return number % 2 == 0;
    }
}
