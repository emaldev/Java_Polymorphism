package Inner_Class;

import Inner_Class.outerClass.InnerClass;

class outerClass{
    int x = 10;

    class InnerClass{
        int y = 12;

    }
}
public class Main {
    public static void main(String[] args){
          outerClass myouterClass = new outerClass();
          outerClass.InnerClass myInnerclass = myouterClass.new InnerClass();


           System.out.println(myInnerclass.y);
          System.out.println(myouterClass.x);
          System.out.println("The sum of outer and Inner is :" + myouterClass.x + myInnerclass.y);
    }
}
 
