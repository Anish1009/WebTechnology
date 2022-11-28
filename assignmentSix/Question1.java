import java.util.*;
public class Question1{
    public static void multiply(int a, int b){
        if(a == 0 || b == 0)
            throw new ArithmeticException("Multiplication by zero not allowed");
        else {
            System.out.println(a * b);
        }
    }
    public static void divide(int a, int b){
        if(a == 0 || b == 0)
            throw new ArithmeticException("Division by zero not allowed");
        else {
            System.out.println(a/b);
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int x = sc.nextInt();
        System.out.print("Enter the second number : ");
        int y = sc.nextInt();
        try {
            divide(x,y);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        try{
            multiply(x,y);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        sc.close();
    }
}
