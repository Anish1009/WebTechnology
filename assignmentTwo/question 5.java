/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    System.out.println("Enter a number: ");
	    
	    // Taking input from user
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("n n^2 n^3 n^4");

        for(int i = 1 ; i <= n ; i++)
        {
            System.out.println(i + " " + Math.pow(i , 2) + " " + Math.pow(i , 3) + " " + Math.pow(i , 4));
        }
	}
}
