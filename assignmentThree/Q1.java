import java.util.*;

public class Q1{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if(str1.equals(str2))
        {
            System.out.println(0);
        }
        
        for(int i = 0 ; i < str1.length() ; i++)
        {
            if(str1.charAt(i) < str2.charAt(i))
            {
                System.out.println(str1.charAt(i)-str2.charAt(i));
                return;
            }
            else if(str2.charAt(i) < str1.charAt(i))
            {
                System.out.println(str1.charAt(i)-str2.charAt(i));
                return;
            }
        }

        if(str1.length() > str2.length())
        {
            System.out.println(str2.length());
            return;
        }
        else if(str1.length() < str2.length())
        {
            System.out.println(str1.length());
            return;
        }
    }
}
