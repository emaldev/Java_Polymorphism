package Polymorphism;

public class PayPalpayment extends Payment{
    private double amount;
    private double feePercent;
    
    public PayPalpayment(double amount, double feePercent){
        this.amount = amount;
        this.feePercent = feePercent;
        
    }
    public double calculatePayment(){
        return amount + (amount * feePercent / 100);
        
    }

    public void displayPayment(){
        System.out.println("payPal Payment(with fee ): " + calculatePayment());
    
    }
    
}
