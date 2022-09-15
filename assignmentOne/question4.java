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
