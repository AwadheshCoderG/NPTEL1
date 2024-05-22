// A program that declares two objects of the Circle class
// Call this file CircleDemo2.java
package NPTEL1;

class Circle_1{
    double x, y;
    double r;
    double circumference(){
        return 2 * 3.14159 * r;
    }

    double area(){
        return (22/7) * r * r;
    }
}
class Demonstration_32 {
    public static void main(String[] args) {
        Circle_1 c1 = new Circle_1();
        Circle_1 c2 = new Circle_1();
        c1.x = 3.0;
        c1.y = 4.0;
        c1.r = 5.0;
        c2.x = -4.0;
        c2.y = -8.0;
        c2.r = 10.0;
        System.out.println("Circumference Circle 1: "+ c1.circumference());
        System.out.println("Area Circle 1: "+ c1.area());
        System.out.println("Circumference Circle 2: "+ c2.circumference());
        System.out.println("Area Circle 2: "+c2.area());
    }
}
