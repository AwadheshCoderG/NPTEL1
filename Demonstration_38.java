// A Java program to demonstrate working of constructor in Java
package NPTEL1;

class Circle_3{
    double x, y;
    double r;
    double circumference(){
        return 2 * 3.14159 * r;
    }
    double area(){
        return (22/7)* r * r;
    }

    Circle_3(double a, double b, double c){
        x = a; // set center x coordinate
        y = b;  // set center y coordinate
        r = c;  // set radius
    }
}
class Demonstration_38 {
    public static void main(String[] args) {
        Circle_3 c1 = new Circle_3(3.0, 4.0, 5.0);
        Circle_3 c2 = new Circle_3(-4.0, 8.0, 10.0);
        System.out.println("Circumference Circle 1: "+c1.circumference());
        System.out.println("Area Circle 1: "+c1.area());
        System.out.println("Circumferemce Circle 2: "+c2.circumference());
        System.out.println("Area Circle 2: "+c2.area());
    }
}
