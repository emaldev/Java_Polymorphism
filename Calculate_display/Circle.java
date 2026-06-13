package Calculate_display;

public class Circle extends Shape{
    private double radius;
    
    public Circle(double radius){
         this.radius = radius;
    }
    public double calculateArea(){
        return 3.14 * radius * radius;
    }

    public void displayInfo(){
        System.out.println("circle area :" + calculateArea());
    }
    
}
