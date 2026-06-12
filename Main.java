public class Main {
    
    public static void main(String[] args){
        System.out.println("Program Strted ");
        Employee empoyee = new Employee("Emal Hasanzada", 2390.45);
        Employee manager = new Manager("Mohammad" , 234.235);
        Employee intern = new Intern("Ali " , 456.34);

        empoyee.displayInfo();
        manager.displayInfo();
        intern.displayInfo();
    }
}
