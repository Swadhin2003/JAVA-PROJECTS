abstract class TwoDshape 
{
    private double width;
    private double height;
    private String name;
    TwoDshape() 
    {
        width = height = 0.0;
        name = "null";
    }
    TwoDshape(double w, double h, String n) 
    {
        width = w;
        height = h;
        name = n;
    }    
    double getWidth() 
    {
        return width;
    }    
    double getHeight() 
    {
        return height;
    }    
    void setWidth(double w) 
    {
        width = w;
    }    
    void setHeight(double h) 
    {
        height = h;
    }    
    String getName() 
    {
        return name;
    }    
    void setName(String n) 
    {
        name = n;
    }    
    void showDimensions() 
    {
        System.out.println("Width: " + width + ", Height: " + height);
    }
    abstract double area();
}
class Triangle extends TwoDshape 
{
    Triangle() 
    {
        super();
    }    
    Triangle(double w, double h) 
    {
        super(w, h, "Triangle");
    }    
    double area() 
    {
        return 0.5 * getWidth() * getHeight();
    }
}
class Rectangle extends TwoDshape 
{
    Rectangle() 
    {
        super();
    }    
    Rectangle(double w, double h) 
    {
        super(w, h, "Rectangle");
    }    
    double area() 
    {
        return getWidth() * getHeight();
    }
}
public class QUESTION3 
{
    public static void main(String[] args) 
    {
        TwoDshape shape;        
        shape = new Triangle(10, 20);
        shape.showDimensions();
        System.out.println("Area of " + shape.getName() + " is " + shape.area());        
        shape = new Rectangle(10, 20);
        shape.showDimensions();
        System.out.println("Area of " + shape.getName() + " is " + shape.area());
    }
}