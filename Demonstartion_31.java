// A program that uses the circle class
// Call this file Demonstration_31.java
// Encapsulation
package NPTEL1;

class Circle{
    double x, y; // The coordinates of the circle
    double r; // The radius

    // Method that returns the circumference
    double circumference(){
        return 2 * 3.14159 * r;
    }

    // Method that return area
    double area(){
        return (22/7) * r * r;
    }
}

class Demonstartion_31 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.x = 0.0;
        c.y = 0.0;
        c.r = 5.0;
        System.out.println("Circumference: "+ c.circumference());
        System.out.println("Area: "+c.area());
    }
}
