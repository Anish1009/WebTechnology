/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
		int years = 0; // to calculate no. of years
        double population = 80000;
        while(population < 150000)
        {
            double increment = 0.05 * population; // population increases 5% annualy
            years++;
            population += increment;
        }

        System.out.println("The population will exceed 150000 after " + years + " years");
	}
}
