package exception.question3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        try {
            addElement(5);
            addElement(10);
            addElement(1);
            addElement(5);
        }
        catch (ElementNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    public static boolean existElement(int element) throws ElementNotFoundException{
        for (int num:numbers) {
            if (num == element)
                return true;
        }
        throw new ElementNotFoundException("Element Not Found.");
    }

    public static void addElement(int element) throws ElementNotFoundException {
        try {
            existElement(element);
            System.out.println("Already Exist...");
        }
        catch (ElementNotFoundException ex){
            numbers.add(element);
            System.out.println("New Element Added.");
            throw ex;
        }
    }
}