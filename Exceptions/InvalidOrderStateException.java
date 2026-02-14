package Exceptions;

public class InvalidOrderStateException extends Exception{
    public InvalidOrderStateException(String message){
        super(message);
    }
}
