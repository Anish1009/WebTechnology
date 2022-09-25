import java.util.Scanner;

public class Question5
{
	public static void main(String[] args) {
	    
	System.out.println("Enter a number: ");
	    
	// Taking input from user
	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("n n^2 n^3 n^4");

        for(int i = 1 ; i <= n ; i++)
        {
            System.out.println(i + " " + (int)Math.pow(i , 2) + " " + (int)Math.pow(i , 3) + " " + (int)Math.pow(i , 4));
        }
	}
}
