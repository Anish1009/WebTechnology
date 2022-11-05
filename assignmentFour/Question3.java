import java.util.*;

class Number{
    private double n;

    Number(double n){
        this.n = n;
    }

    boolean isZero(){
        return (n == 0);
    }

    boolean isPositive(){
        return (n > 0);
    }

    boolean isNegative(){
        return (n < 0);
    }

    boolean isOdd(){
        return ((n % 2) != 0);
    }

    boolean isEven(){
        return ((n % 2) == 0);
    }

    boolean isPrime(){
        for (int i = 2; i < n; i++){
            if ((n % i) == 0){
                return false;
            }
        }
        return true;
    }

    boolean isArmstrong(){
        
        int number = (int)n;
        int sum = 0, temp;
        int digits=0;
        temp = number;
        while (temp > 0){
            temp = temp / 10;
            digits++;
        }

        temp = number;

        while (temp > 0){
            sum = sum + Math.pow(temp % 10, digits);
            temp = temp / 10;
        }

        if (number == sum){
            return true;
        }
        else{
            return false;
        }
    }

    double getFactorial(){
 
        int number = (int)n;
        double factorial = 1;
        for (int i = 2; i <= number; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    double getSqrt(){
        return Math.sqrt(n);
    }

    double getSqr(){
        return Math.pow(n, 2);

    }

    double sumDigits(){
        int number = (int)n;
        double sum = 0;
        while (number > 0){
            sum = sum + (number % 10);
            number = number / 10;
        }
        return sum;

    }

    double getReverse(){
        int number = (int)n;
        double rev = 0;
        while (number > 0){
            rev = (rev * 10) + (number % 10);
            number = number / 10;
        }
        return rev;        
    }

    void listFactor(){
        for (int i = 0; i < n; i++) {
            if ((n % i) == 0){
                System.out.print(i + " ");
            }
            
        }
        System.out.println();

    }

    void listBinary(){
        int number = (int)n;
        if (n == 0){
            System.out.println("0");
            return;
        }
        
        StringBuilder binaryOutput = new StringBuilder();
        while (number > 0){
            binaryOutput.insert(0, (number & 1));
            number = number >> 1;
        }
        System.out.println(binaryOutput);

    }

}

public class Question3 {
    public static void main(String[] args) {
        
        Number n1 = new Number(234);
        
        System.out.println(n1.isZero());
        System.out.println(n1.isPrime());
        System.out.println(n1.isArmstrong());
        System.out.println(n1.getFactorial());
        System.out.println(n1.getSqrt());
        System.out.println(n1.getSqr());
        System.out.println(n1.sumDigits());
        System.out.println(n1.getReverse());
        n1.listFactor();   
        n1.listBinary();
    }
    
}
