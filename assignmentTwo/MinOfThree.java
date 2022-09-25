public class MinOfThree
{
    
    public static void main(String[] args){

        int a = 20;
        int b = 5;
        int c = 32;
        int minNo;

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
