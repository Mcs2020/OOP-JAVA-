class Shape
{
    private String color;
    public Shape(String color) {
        this.color = color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }   
    public double getArea()
    {
        return 0;
    }
    @Override
    public String toString()
    {
        return "Shape";
    }
}

class Rectangle extends Shape
{
    private int width,length;

    public Rectangle(int width, int length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }
    @Override
    public double getArea()
    {
        return width*length;
    }
    @Override
    public String toString()
    {
        return "Rectangle Shape";
    }
}

class Triangle extends Shape
{
    private int base, height;

    public Triangle(int base, int height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }
    @Override
    public double getArea()
    {
        return 0.5*base*height;
    }
    @Override
    public String toString()
    {
        return "Triangle Shape";
    }
}

class circule extends Shape
{
    private int radius;
    final double PI = 22/7.0;
    
    public circule(int radius, String color) {
        super(color);
        this.radius = radius;
    }
    @Override
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    @Override
    public String toString()
    {
        return "Circle Shape";
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        Shape s = new Shape("Red");
        System.out.println(s.toString() + "- "+s.getArea());
        s = new Rectangle(3, 5, "Green");
        System.out.println(s.toString() + "- "+s.getArea());
        s = new Triangle(1, 7, "Yellow");
        System.out.println(s.toString() + "- "+s.getArea());
        s = new circule(3, "Blue");
        System.out.println(s.toString() + "- "+s.getArea());
    }
    
}
