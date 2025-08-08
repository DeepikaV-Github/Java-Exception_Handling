package demo.example.exceptions;

public class UnSufficientBalanceException extends Exception {
    private String msg;
    public UnSufficientBalanceException() {
    }
    public UnSufficientBalanceException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
