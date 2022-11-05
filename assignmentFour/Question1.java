import java.util.*;

public class Question1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        Vector v1 = new Vector(size);

        for (int i = 0; i < size; i++){
            int n = sc.nextInt();
            v1.addElement(n);
        }
        
        System.out.println("The Vector created is : ");
        for (int i = 0; i < size; i++) {
            System.out.println(v1.elementAt(i));            
        }
    }
}
