/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int x = 10;
	    int y = 20;
	    
	    System.out.println("Value of x and y before swapping : " + x + " " + y);
	    
	    int temp = x;
	    x = y;
	    y = temp;
	    
		System.out.println("Value of x and y after swapping : " + x + " " + y);
		
		
		x = x^y;
		y = x^y;
		x = x^y;
		
		System.out.println("Value of x and y after swapping without temp : " + x + " " + y);
	}
}
