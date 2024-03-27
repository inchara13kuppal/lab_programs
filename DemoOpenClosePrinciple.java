package week8;
import java.util.Scanner;
interface Shape
{
    short calculateArea();
}

class Rectangle implements Shape 
{
    short length;
    short width;

    Rectangle() {
        Scanner inScanner = new Scanner(System.in);
        System.out.println("Enter length of rectangle...");
        length = inScanner.nextShort();
        System.out.println("Enter width of rectangle...");
        width = inScanner.nextShort();
    }

    public short calculateArea()
    {
        return (short) (length * width);
    }
}

class Circle implements Shape
{
    public short radius;
    Circle() {
        Scanner inScanner = new Scanner(System.in);
        System.out.println("Enter radius of Circle...");
        radius = inScanner.nextShort();
    }

    public short calculateArea() {
        return (short) (3.14 * radius * radius);
    }
}

class Square implements Shape
{
    short side;

    Square() {
        Scanner inScanner = new Scanner(System.in);
        System.out.println("Enter side of Square...");
        side = inScanner.nextShort();
        inScanner.close();
    }

    public short calculateArea() {
        return (short) (side * side);
    }
}

class InvokeShape {
    public short calculateShapeArea(Shape shape) {
        return shape.calculateArea();
    }
}

public class DemoOpenClosePrinciple {
    public static void main(String[] args) {
        InvokeShape is = new InvokeShape();
        Rectangle rect = new Rectangle();
        Circle cir = new Circle();
        Square sqr = new Square();

        short rArea = is.calculateShapeArea(rect);
        short cArea = is.calculateShapeArea(cir);
        short sArea = is.calculateShapeArea(sqr);

        System.out.println("\n*********OUTPUT*********");
        System.out.println("\nArea of Rectangle is " + rArea);
        System.out.println("Area of Circle is " + cArea);
        System.out.println("Area of Square is " + sArea);
    }
}
