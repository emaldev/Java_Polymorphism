package Full_Time_salary_polymorphism;

public class Person {
    protected String name;
    
    
    public Person(String name){
        this.name = name;
       
    
    }
    
    public double calculateSalary(){
         return 0.0;
    }
    public void displayInfo(){
        System.out.println("Name: " + name + ", Salary: " + calculateSalary());
    }
    
}
