import java.io.*;
class Employee implements Serializable 
{
    private static final long serialVersionUID = 1L;
    private String name;
    private int emp_id;
    private double salary;    
    public Employee(String name, int emp_id, double salary) 
    {
        this.name = name;
        this.emp_id = emp_id;
        this.salary = salary;
    }    
    public String getName() 
    {
        return name;
    }    
    public int getEmpID() 
    {
        return emp_id;
    }    
    public double getSalary() 
    {
        return salary;
    }
}
public class QUESTION4 
{
    public static void main(String[] args) 
    {
        try 
        {            
            FileOutputStream fileOut = new FileOutputStream("employees.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);            
            Employee[] employees = 
            {
                new Employee("ROHIT", 1001, 50000),
                new Employee("KOHLI", 1002, 60000),
                new Employee("DHONI", 1003, 70000),
                new Employee("HARDIK", 1004, 80000),
                new Employee("SURYA", 1005, 90000),
                new Employee("BUMRAH", 1006, 100000),
                new Employee("SHAMI", 1007, 110000),
                new Employee("ISHAN", 1008, 120000),
                new Employee("BREVIS", 1009, 130000),
                new Employee("GAYLE", 1010, 140000)
            };            
            for (Employee emp : employees) 
            {
                out.writeObject(emp);
            }            
            out.close();
            fileOut.close();
            FileInputStream fileIn = new FileInputStream("employees.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);            
            System.out.println("Employees with salary between 80,000 and 120,000:");
            while (true) 
            {
                try 
                {
                    Employee emp = (Employee) in.readObject();
                    if (emp.getSalary() >= 80000 && emp.getSalary() <= 120000) 
                    {
                        System.out.println(emp.getName() + " (Employee ID: " + emp.getEmpID() + ")");
                    }
                } 
                catch (EOFException e) 
                {
                    break;
                }
            }            
            in.close();
            fileIn.close();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        catch (ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
    }
}