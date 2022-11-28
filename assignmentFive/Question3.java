import java.util.*;
class Marks
{
    int rollNo;
    static int id= 1;
    static int totalMarks = 0;
    String name;
    int marks;

    void setMarks(String name, int marks){
        this.marks=marks;
        this.name=name;
        this.rollNo=id;
        
    }
    public String toString(){
        return "Name "+name+" Roll No.="+rollNo+" Total Marks="+marks;
    }


}

class Physics extends Marks
{
    
}

class Chemistry extends Marks
{
   
     
}
class Maths extends Marks
{
   
     
}
class Question3{
    public static void main(String[] args){
        System.out.println("Enter total number of students");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Enter Name ");
            String name = sc.next();
            System.out.println("Enter marks in maths");
            int math = sc.nextInt();
            Maths m = new Maths();
            m.setMarks(name, math);
            System.out.println("Enter marks in Chem");
            int chem = sc.nextInt();
            Chemistry c = new Chemistry();
            c.setMarks(name, chem);
            System.out.println("Enter marks in Physics");
            int physics = sc.nextInt();
            Physics p = new Physics();
            p.setMarks(name, physics);
            Marks total = new Marks();
            total.setMarks(name, physics+chem+math);
            Marks.totalMarks += physics+chem+math;
            Marks.id+=1;
            System.out.println(total);
        }
        System.out.println("Average Marks = "+Marks.totalMarks /n);

        
    }
}
