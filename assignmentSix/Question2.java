import java.util.*;

public class Question2{
    public static void addition(int a, int b) {
        if(a < 0 || b < 0) {
            throw new ArithmeticException("Negative numbers are not allowed");
        }
        else {
            System.out.println(a+b);
        }
    }
    public static void subtraction(int a, int b) {
        if(a < 0 || b < 0) {
            throw new ArithmeticException("Negative numbers are not allowed");
        }
        else {
            System.out.println(a-b);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();

        try {
            addition(num1, num2);
        }
        catch(ArithmeticException e) { 
            System.out.println(e);
        }
        try {
            subtraction(num1, num2);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }

        sc.close();
    }
}
