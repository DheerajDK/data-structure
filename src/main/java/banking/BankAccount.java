package banking;
import java.util.*;
public abstract class BankAccount {
Double amount;
Double rateOfInterest;


public BankAccount(Double amount,Double rateOfInterest){
    this.amount=amount;
    this.rateOfInterest=rateOfInterest;
}

public abstract Double getInterest(Integer years);
}