package Polymorphism;

public class CrediteCarePayment extends Payment{
    private double amount;

    public CrediteCarePayment(double amount){
        this.amount = amount;
    }

    public double calculatePayment(){
        return amount;
    }
    public void displayPayment(){
        System.out.println("Credit Card Payment: " + calculatePayment());
    }
    
}
