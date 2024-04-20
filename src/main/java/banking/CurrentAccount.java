package banking;
import java.io.*; 

public class CurrentAccount extends BankAccount {

public CurrentAccount(Double amount,Double rateOfInterest){
        super(amount,rateOfInterest);
    }

    
    @Override
    public Double getInterest(Integer years){
        System.out.println("amount = "+amount);
        System.out.println("rateOfInterest = "+rateOfInterest);
        System.out.println("years = "+years);
        double totalIntegrest = (amount * 
                    Math.pow((1 + rateOfInterest / 4), 4*years)) - amount; 
        System.out.println("Compound Interest is "+ totalIntegrest); 
        return totalIntegrest;

    }
}