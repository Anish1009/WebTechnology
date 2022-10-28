import java.util.Arrays;
public class Q3{
    public static void main(String []args)
    {
        String st = "anishbalgotra";
        char arr[] = st.toCharArray();
        Arrays.sort(arr);
        String st1 = new String(arr);
        System.out.println(st1);
    }
}