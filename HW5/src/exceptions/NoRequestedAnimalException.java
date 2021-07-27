package exceptions;

public class NoRequestedAnimalException extends Exception{
    public NoRequestedAnimalException(String message) {
        super(message);
    }
}
