import java.util.Scanner;

public class Q4{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        while(n != 1)
        {
            System.out.print(n + " ");
            if(n % 2 != 0)
            {
                n = (n*3) + 1;
            }
            else
            {
                n = n/2;
            }
        }
        System.out.print(n);
    }
}
