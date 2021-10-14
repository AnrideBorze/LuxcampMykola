import java.util.Random;

public class EmployeeFactory {
    private static final String[] namesMan = {"Andrey", "Ivan", "Oleh", "Tolik", "Mikolay", "David", "Igor"};
    private static final String[] namesWoman = {"Alla", "Ira", "Oksana", "Tania", "Mariana", "Daria", "Inga"};
    public static String generateName(boolean gender){
        Random random = new Random();
        if(gender){
            return namesMan[random.nextInt(namesMan.length)];
        }
        else return namesWoman[random.nextInt(namesWoman.length)];
    }

 public static Employee[] generateEmployees(int size){
     Random random = new Random();


     int count = 0;
     Employee[] employees = new Employee[size];

     for (int i =0; i< random.nextInt(size);i++){
         Boolean gender = i%2==0;
         String name = generateName(gender);

            Developer developer = new Developer(count+1 , name, random.nextInt(50)+20, 1000.0 + 100*i,gender, random.nextInt(50));
            employees[count] = (Employee)developer;
            count++;
}
     for (int i =0; i< random.nextInt(size-count);i++){
         Boolean gender = i%2==0;
         String name = generateName(gender);
         Designer designer = new Designer(count+1, name, random.nextInt(50)+20, 1200.0 + 100*i,gender,50, random.nextInt(10)+20);
         employees[count] = (Employee)designer;
         count++;
     }
     for (int i =0; count < size;i++){
         Boolean gender = i%2==0;
         String name = generateName(gender);
         Manager manager = new Manager(count+1,name,random.nextInt(50)+20,1300,gender);
         employees[count] = (Employee)manager;
         count++;
     }



        return  employees;
    }

}
