public class Question4
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
