abstract class Shope
 {
    public abstract  double area();

    public void display(){
        System.out.println("Thsi is a Shape ");
    }
}
     class Circle extends Shope{
        private double radius = 5;
        @Override 
        public double area(){
           return 3.14 * radius * radius;
        }
     }

     class Rectangle extends Shope{
        private double width = 4, height = 6;
          @Override
          public double area(){
                 return width * height;
          }
     }




public class Shape {
    public static void main(String[] args){
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        System.out.println("Circle area: " + c.area());
        System.out.println("Rectangle area: " + r.area());
    }
    
}
