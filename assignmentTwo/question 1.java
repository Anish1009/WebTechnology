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
		Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the Number: "); 
        double n = sc.nextInt();

        // If Statement
        if(n >= 80 && n <= 90)
        {
            n += 5;
        }

        System.out.println(n);
	}
}
