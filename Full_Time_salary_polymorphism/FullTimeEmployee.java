package Full_Time_salary_polymorphism;

public class FullTimeEmployee extends Person{
    private double monthlySalary;

   
    public FullTimeEmployee(String name,double monthlySalary){
        super(name);
        this.monthlySalary = monthlySalary;
    
    }
   
    public double calculateSalary(){
        return monthlySalary;
    }

    
    public void displayInfo() {
        
        System.out.println("Full-Time:" + name + ", Salary: " + calculateSalary());
    
    }
    
}
