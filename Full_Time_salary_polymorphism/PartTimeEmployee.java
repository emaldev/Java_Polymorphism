package Full_Time_salary_polymorphism;

public class PartTimeEmployee extends Person{
    private double  hourlyRate;
     private int hoursWorked;
     public PartTimeEmployee(String name, double hourlyRate, int hoursWorked){
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
     }
    public double calculateSalary(){
            return hourlyRate * hoursWorked;
    }

    public void displayInfo(){
        System.out.println("Part-Time: " + name + ", Salary:" + calculateSalary());
    }
    
}
