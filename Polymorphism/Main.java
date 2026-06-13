package Polymorphism;

public class Main {
    public static void main(String[] args){
        Payment[] payments = new Payment[2];
        payments[0] = new CrediteCarePayment(100.0);
        payments[1] = new PayPalpayment(100.0, 5.0);


        for(int i = 0; i < payments.length; i++){
            payments[i].displayPayment();
        }
    }
    
}
