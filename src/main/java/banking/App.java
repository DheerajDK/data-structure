package banking;
public class App {
    public static void main(String args[]){
        SavingAccount savingAccount=new SavingAccount(1000.0,0.05);
        savingAccount.getInterest(1);
        CurrentAccount currentAccount=new CurrentAccount(1000.0,0.05);
        currentAccount.getInterest(1);

        
    }
}