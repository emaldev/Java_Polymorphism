package Full_Time_salary_polymorphism;

public class Main {

    public static void main(String[] args){
        Person myperson = new Person("Ali");
        Person fullTime = new FullTimeEmployee("mohammad",789.90 );
        Person partTime = new PartTimeEmployee("Ali", 15.0, 12);
         
        
        myperson.displayInfo();
        fullTime.displayInfo();
        partTime.displayInfo();
        
    }
    
}
