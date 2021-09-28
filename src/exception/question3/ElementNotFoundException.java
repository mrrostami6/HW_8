package exception.question3;

public class ElementNotFoundException extends Exception{
    public ElementNotFoundException() {
    }

    public ElementNotFoundException(String message) {
        super(message);
    }
}
