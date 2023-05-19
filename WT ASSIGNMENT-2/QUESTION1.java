class Account 
{
    int acc_no;
    double balance;
    Account(int acc_no, double balance) 
    {
        this.acc_no = acc_no;
        this.balance = balance;
    }
    void display() 
    {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}
class Person extends Account 
{
    String name;
    String aadhar_no;
    Person(int acc_no, double balance, String name, String aadhar_no) 
    {
        super(acc_no, balance);
        this.name = name;
        this.aadhar_no = aadhar_no;
    }
    void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
        super.display();
    }
}
public class QUESTION1
{
    public static void main(String[] args) 
    {
        Person p1 = new Person(1001, 5000, "ROHIT SHARMA", "1234 5678 9012");
        p1.display();
        System.out.println("------------------");
        Person p2 = new Person(1002, 10000, "VIRAT KOHLI", "9876 5432 1098");
        p2.display();        
        System.out.println("------------------");        
        Person p3 = new Person(1003, 15000, "MS DHONI", "2468 1357 8024");
        p3.display();        
        System.out.println("------------------");        
        Person p4 = new Person(1004, 20000, "SANJU SAMSON", "8642 9753 0134");
        p4.display();        
        System.out.println("------------------");        
        Person p5 = new Person(1005, 25000, "JASON ROY", "7531 6802 4987");
        p5.display();
    }
}