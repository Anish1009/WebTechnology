/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		
		// Initialising numbers
		int a = 20;
        int b = 5;
        int c = 32;
        
        int minNo; // Stores the minimum Number

        if(a < b)
        {
            if(a < c)
            {
                minNo = a;
            }
            else
            {
                minNo = c;
            }
        }
        else
        {
            if(b < c)
            {
                minNo = b;
            }
            else
            {
                minNo = c;
            }
        }

        System.out.println("The Smallest No. is: " + minNo);
	}
}
