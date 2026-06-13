package Calculate_display;

public class Main {
    public static void main(String[] args){
        Shape myShap = new Shape();
        Rectangle myRectangle = new Rectangle(12.3, 3.6);
        Circle  myCircle = new Circle(12);
        System.out.println("<<::========================================================::>>");
        myShap.displayInfo();
        myCircle.displayInfo();
         myRectangle.displayInfo();
        System.out.println("<<::========================================================::>>");
    }
}
