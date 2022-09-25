import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the Number: "); 
        double n = sc.nextDouble();

        // If Statement
        if(n > 80 && n < 90)
        {
            n += 5;
        }

        System.out.println(n);
	}
}
