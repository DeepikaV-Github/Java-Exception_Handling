package demo.example.entity;

public class BankAccount {
private int custId;
private long custAccountNumber;
private String custName;
private double custAccountBalance;
private double accountLimit=500000;

    public void setAccountLimit(double accountLimit) {
        this.accountLimit = accountLimit;
    }

    public double getAccountLimit() {
        return accountLimit;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public void setCustAccountNumber(long custAccountNumber) {
        this.custAccountNumber = custAccountNumber;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustAccountBalance(double custAccountBalance) {
        this.custAccountBalance = custAccountBalance;
    }

    public int getCustId() {
        return custId;
    }

    public long getCustAccountNumber() {
        return custAccountNumber;
    }

    public String getCustName() {
        return custName;
    }

    public double getCustAccountBalance() {
        return custAccountBalance;
    }

    public BankAccount(int custId, long custAccountNumber, String custName, double custAccountBalance) {
        this.custId = custId;
        this.custAccountNumber = custAccountNumber;
        this.custName = custName;
        this.custAccountBalance = custAccountBalance;
    }

    public String toString(){
        return custName + " " +custAccountNumber +" " + custAccountBalance;
    }
}
