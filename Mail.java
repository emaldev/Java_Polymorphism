//-----------(Java Abstraction)--------
// This is a super class include all animals 
abstract class Animal{
    public abstract void animalSound();

    public void sleep(){
        System.out.println("Zzz");
    }
}

            class Pid extends Animal{
                @Override
                public void animalSound(){
                    System.out.println("wee wee");
                }
            }


public class Mail {
    public static void main(String[] args){
        Pid myPid = new Pid();
        myPid.animalSound();


    }
}
