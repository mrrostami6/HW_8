package exception.question2;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo {
    static int[] numbers = {1, 2, 3, 4, 5, 6, 7};
    static Integer[] nullArray = {null, 1};

    public static void main(String[] args) {
        try {
            System.out.println(div(5, 2.5));
            System.out.println(div(1, 0));
        }
        catch (AException ex){
            ex.printStackTrace();
        }

        try {
            System.out.println(exist(1));
            System.out.println(exist(10));
        }
        catch (BException ex){
            ex.printStackTrace();
        }

        try {
            System.out.println(nullArray[0]);
        }
        catch (NullPointerException ex){
            ex.printStackTrace();
        }

        try
        {
            FileInputStream in = new FileInputStream("input.txt");
            System.out.println("This is not printed");
        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }

    }

    public static double div(double a, double b) throws AException {
        if (b == 0)
            throw new AException("Cant divide by zero");
        else
            return a / b;
    }

    public static boolean exist(int num) throws BException {
        for (int number:numbers) {
            if (num == number)
                return true;
        }
        throw new BException("Data Not Found...");
    }
}

