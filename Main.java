abstract class Animal{
    public abstract void animalSound();

    public void Sleep(){
        System.out.println("Zzz...");
    }
}

class Cat extends Animal{
    @Override 
    public void animalSound(){
        System.out.println("The cat sound is : mow mow mow ");
    }

    
}
public class Main {
    public static void main(String[] args){
        
         Cat mycat = new Cat();
         mycat.animalSound();
      
    }
}
