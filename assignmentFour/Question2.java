class Employee
{
    String name;
    int year;
    int salary;
    String address;

    Employee(String name , int year , int salary , String address)
    {
        this.name = name;
        this.year = year;
        this.salary = salary;
        this.address = address;
    }

    void print()
    {
        System.out.println(this.name + "    " + this.yearOfJoining + "    " + this.salary + "    " + this.address);
    }
}

public class Question2 {
    public static void main(String[] args) {
  
        Employee employee1 = new Employee("Robert", 1994, 20000, "64C-Wallstreet");
        Employee employee2 = new Employee("Sam", 2000, 15000, "68D-Wallstreet");
        Employee employee3 = new Employee("John", 1999, 40000, "26B-Wallstreet");

        System.out.println("Name    Year of Joining     Salary      Address");
        employee1.print();
        employee2.print();
        employee3.print();
             
    }
    
}
