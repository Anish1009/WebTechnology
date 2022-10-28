public class Q2{

    public static void main(String []args)
    {
        int arr1[] = {2,3,4,2,3,6,7,1,8,9,3,4,5,2,20,19,18};
        int arr2[] = new int[21];

        for(int i = 0 ; i < arr1.length ; i++)
        {
            arr2[arr1[i]]++;
        }

        System.out.println("The sorted array is : ");
        for(int i = 0 ; i < arr2.length ; i++)
        {
            if(arr2[i] > 0)
            {
                for(int j = 0 ; j < arr2[i] ; j++)
                    System.out.print(i + " ");
            }
        }

    }
}