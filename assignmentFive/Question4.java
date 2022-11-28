public class Question4{
    static int a = 20;
    Question4() {
    a++;
    }
    void m1() {
    a++;
    System.out.println(a);
    }
    public static void main(String[]
    args)
    {
    Question4 obj = new Question4();
    Question4 obj2 = new Question4();
    Question4 obj3 = new Question4();
    obj3.m1();
    }
}
// Output : 24
