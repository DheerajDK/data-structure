package banking;
import java.io.*; 

public class SavingAccount extends BankAccount {

    public SavingAccount(Double amount,Double rateOfInterest){
        super(amount,rateOfInterest);
    }
    
    @Override
    public Double getInterest(Integer years){
        double totalIntegrest = (amount * 
                    (Math.pow((1 + rateOfInterest / 12), 12*years))) - amount; 
        System.out.println("Compound Interest is "+ totalIntegrest); 
        return totalIntegrest;

    }
}