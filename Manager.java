public class Manager extends Employee{
    
      public  Manager(String name, double baseSalary){
        super(name, baseSalary);
      }

    public void displayInfo(){
        System.out.println("Manager - Name :" + name + "Salary " + baseSalary);
        
    }
    
}
