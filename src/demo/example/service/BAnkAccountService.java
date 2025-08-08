package demo.example.service;

import demo.example.entity.BankAccount;
import demo.example.exceptions.UnSufficientBalanceException;

public class BAnkAccountService implements BankAccountServiceImp {

    BankAccount bankAccount;
    @Override
    public void checkbalance(BankAccount account) {
        System.out.println(account.getCustAccountBalance() + " is the balance of " + account.getCustName());
    }
    @Override
    public void withdrawAmount(BankAccount account, double amount) throws UnSufficientBalanceException {
        if(account.getCustAccountBalance()<amount) {
            System.out.println("Insufficient balance");}
        else {
            System.out.println("account balance after withdrawal of amount:" + amount+" is-" + (account.getCustAccountBalance()-amount));
            System.out.println("done......" + account.getCustName());
        }
    }
    @Override
    public void depositAmount(BankAccount account, double amount) {
        if(account.getAccountLimit()>account.getCustAccountBalance()+amount) {
            throw new
        }
        account.setCustAccountBalance(account.getCustAccountBalance()+amount);
        System.out.println("account balance after deposit of amount:" +amount+" is-"+ (account.getCustAccountBalance())) ;
    }


}
