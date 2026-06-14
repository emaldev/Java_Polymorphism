import outerClass.innerClass;

class outerClass{
    int x = 10;

    class  innerClass{
        int y = 8;
    }
}

public class InnerClass {
          
    public static  void main(String[] args){
        outerClass myClass = new outerClass();
      outerClass.innerClass myInnerC  = myClass.new innerClass();

        System.out.println(myInnerC.y + myClass.x);
    }
}
