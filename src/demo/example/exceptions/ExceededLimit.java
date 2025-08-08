package demo.example.exceptions;

public class ExceededLimit extends RuntimeException {
    public ExceededLimit(String message) {
        super(message);
    }

}
