package demo.example.service;

import demo.example.entity.BankAccount;
import demo.example.exceptions.UnSufficientBalanceException;

public interface BankAccountServiceImp {
    public void checkbalance(BankAccount account);
    public void withdrawAmount(BankAccount account,double amount) throws UnSufficientBalanceException;
    public void depositAmount(BankAccount account,double amount);
}
