package Calculate_display;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double heitht){
        this.width = width;
        this.height = heitht;
    }
                   public double calculateArea(){
                    return width * height;
                   }
  
    public void displayInfo() {
        System.out.println("Rectangel area: "  + calculateArea());
    }
    
}
