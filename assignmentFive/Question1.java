import java.util.*;

class Mammals{
    void category1()
    {
        System.out.println("I am Mammal");
    }
}

class MarineAnimals{
    void category2()
    {
        System.out.println("I am Marine Animal");
    }
}

class BlueWhale extends Mammals , MarineAnimals{
    void category3()
    {
        System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
    }
}

public class Question1{
    public static void main(String []args)
    {
        Mammals obj1;
        obj1.category1();

        MarineAnimals obj2;
        obj2.category2();

        BlueWhale obj3;
        obj3.category3();

        obj3.category1();
        obj3.category2();
    }
}
