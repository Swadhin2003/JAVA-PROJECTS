class Shape 
{
    void draw() 
    {
        System.out.println("Drawing Shape");
    }
    void erase() 
    {
        System.out.println("Erasing Shape");
    }
}
class Circle extends Shape 
{
    void draw() 
    {
        System.out.println("Drawing Circle");
    }    
    void erase() 
    {
        System.out.println("Erasing Circle");
    }
}
class Triangle extends Shape 
{
    void draw() 
    {
        System.out.println("Drawing Triangle");
    }    
    void erase() 
    {
        System.out.println("Erasing Triangle");
    }
}
class Square extends Shape 
{
    void draw() 
    {
        System.out.println("Drawing Square");
    }    
    void erase() 
    {
        System.out.println("Erasing Square");
    }
}
public class QUESTION2
{
    public static void main(String[] args) 
    {
        Shape s1 = new Circle();
        s1.draw();
        s1.erase();        
        Shape s2 = new Triangle();
        s2.draw();
        s2.erase();        
        Shape s3 = new Square();
        s3.draw();
        s3.erase();
    }
}