import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Rectangle input
        System.out.println("Enter rectangle dimensions:");
        System.out.print("Length: ");
        double length = scanner.nextDouble();
        System.out.print("Width: ");
        double width = scanner.nextDouble();
        Rectangle r1 = new Rectangle(length, width);
        
        // Circle input
        System.out.println("\nEnter circle dimensions:");
        System.out.print("Radius: ");
        double radius = scanner.nextDouble();
        Circle c1 = new Circle(radius);
        
        // Display results
        System.out.println("\nResults:");
        r1.draw();
        System.out.println("Rectangle area = " + r1.area());
        System.out.println("Rectangle perimeter = " + r1.perimeter());
        
        c1.draw();
        System.out.println("Circle area = " + c1.area());
        System.out.println("Circle perimeter = " + c1.perimeter());
        
        scanner.close();
    }
}

interface Shape {
    void draw();
    double area();
    double perimeter();
}

class Rectangle implements Shape {
    private double length;
    private double width;
    
    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }
    
    @Override
    public void draw() {
        System.out.println("Rectangle is drawn");
    }
    
    @Override
    public double area() {
        return length * width;
    }
    
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

class Circle implements Shape {
    private double radius;
    
    public Circle(double r) {
        this.radius = r;
    }
    
    @Override
    public void draw() {
        System.out.println("Circle is drawn");
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}