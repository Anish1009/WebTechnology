import java.util.*;

class Customer{
    String name, address, accountNum;    
    int age;    
    public Customer(String name, String address, String accountNum, int age) {        
        this.name = name;        
        this.address = address;        
        this.accountNum = accountNum;        
        this.age = age;   
     }
}
class Account{
    String Type, branch;
    public Account(String Type, String branch) {        
        this.Type = Type;        
        this.branch = branch;    
    }
}
class RBI { // Base class    
    int minBalance, maxWithdraw;
    double minInterest;    
    public RBI() {
        minBalance = 1000;        
        maxWithdraw = 1000000;        
        minInterest = 4.0;    
    }    
    public void setMinInterest(double minInterest) {        
        if (minInterest >= this.minInterest) {            
            this.minInterest = minInterest;        
        } 
        else {            
            System.out.println("Minimum rate should be: " + this.minInterest + " as per RBI guidelines");        
        }    
    }    
    public void setMinBalance(int minBalance) {        
        if (minBalance >= this.minBalance) {            
            this.minBalance = minBalance;        
        } else {            
            System.out.println("Minimum balance amount should be atleast " + this.minBalance + " as per RBI guidelines");        
        }    
    }
    public void setMaxWithdraw(int maxWithdraw) {        
        if (maxWithdraw > this.maxWithdraw) {            
            this.maxWithdraw = maxWithdraw;        
        } else {            
            System.out.println("Maximum withdrawal limit should be atleast " + this.maxWithdraw + " as per RBI guidelines");        
        }    
    }    
    public void printDetails() {    
        System.out.println("Updated Minimum Balance: " + minBalance);        
        System.out.println("Updated Minimum Interest Rate: " + minInterest);        
        System.out.println("Updated Maximum Withraw Limit: " + minBalance);    
    }
}
class SBI extends RBI { // Child class1
    public SBI(int minBalance, int maxWithdraw, double minInterest) {        
        setMinInterest(minInterest);        
        setMinBalance(minBalance);        
        setMaxWithdraw(maxWithdraw);    
    }    
    public void printDetails() {        
        System.out.println("Final Minimum Balance: " + minBalance);        
        System.out.println("Final Minimum Interest Rate: " + minInterest);        
        System.out.println("Final Maximum Withraw Limit: " + minBalance);    
    }
}
class ICICI extends RBI { // Child class2    
    public ICICI(int minBalance, int maxWithdraw, double minInterest) {        
        setMinInterest(minInterest);        
        setMinBalance(minBalance);        
        setMaxWithdraw(maxWithdraw);    
    }    
    public void printDetails() {        
        System.out.println("Final Minimum Balance: " + minBalance);        
        System.out.println("Final Minimum Interest Rate: " + minInterest);        
        System.out.println("Final Maximum Withraw Limit: " + minBalance);    
    }
}
class PNB extends RBI { // Child class2    
    public PNB(int minBalance, int maxWithdraw, double minInterest) {        
        setMinInterest(minInterest);        
        setMinBalance(minBalance);        
        setMaxWithdraw(maxWithdraw);    
    }    
    public void printDetails() {        
        System.out.println("Final Minimum Balance: " + minBalance);        
        System.out.println("Final Minimum Interest Rate: " + minInterest);        
        System.out.println("Final Maximum Withraw Limit: " + minBalance);    
    }
}
public class Question2 { // Tester code    
    public static void main(String args[]) {        
        Scanner sc = new Scanner(System.in);
        int i;        
        System.out.println("Enter your choice");        
        System.out.println("1: SBI\n2: ICICI\n3: PNB");        
        i = sc.nextInt();      
        if(i < 1 || i > 3)
        {
            System.out.println("Invalid Input");
            return;
        }  
              
        System.out.println("Enter minimum balance, maximum withdraw limit and minimum Interest rate");        
        int x, y;        
        double z;        
        x = sc.nextInt();        
        y = sc.nextInt();        
        z = sc.nextDouble();        
        sc.close();        
        switch (i) {            
            case 1:                
                SBI bank = new SBI(x, y, z);                
                bank.printDetails();                
                break;            
            case 2:                
                ICICI bank1 = new ICICI(x, y, z);                
                bank1.printDetails();                
                break;            
            case 3:               
                PNB bank2 = new PNB(x, y, z);                
                bank2.printDetails();               
                break;                    
        }    
    }
}