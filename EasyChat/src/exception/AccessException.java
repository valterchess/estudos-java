package exception;

public class AccessException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public AccessException(String message){
        super(message);
    }
}
