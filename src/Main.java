import demo.example.entity.BankAccount;
import demo.example.exceptions.UnSufficientBalanceException;
import demo.example.service.BAnkAccountService;

public class Main {

    public static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Division answer is " + divide(100, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        UnSufficientBalanceException unSufficientBalanceException = new UnSufficientBalanceException("no paise");
        BankAccount bankAccount=new BankAccount(1,12,"deepika",20000);
        BAnkAccountService bankAccountService=new BAnkAccountService();
        bankAccountService.checkbalance(bankAccount);
        try{
            bankAccountService.withdrawAmount(bankAccount,200000);
        }catch (UnSufficientBalanceException e){
            System.out.println("--------");
        }

        bankAccountService.depositAmount(bankAccount,1000);
        System.out.println(bankAccount);
    }
}
