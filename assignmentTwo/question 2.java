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
