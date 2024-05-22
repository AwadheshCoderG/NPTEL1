/*Demontration of constructor Overloading */
// Edit Demonstration_311.java
package NPTEL1;

class Circle_5{
    double x, y;
    double r;
    Circle_5(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
    Circle_5(double r){
        x = 0;
        y = 0;
        this.r = r;
    }
    Circle_5(Circle_5 c){
        x = c.x;
        y = c.y;
        r = c.r;
    }
    Circle_5(){
        x = 0.0;
        y = 0.0;
        r = 1.0;
    }
    double circumference(){
        return 2 * 3.14159 * r;
    }
    double area(){
        return (22/7) * r * r;
    }
}
class Demonstration_311 {
    public static void main(String[] args) {
        Circle_5 c1 = new Circle_5(3.0, 4.0, 5.0);
        Circle_5 c2 = new Circle_5(5.0);
        Circle_5 c3 = new Circle_5(c2);
        Circle_5 c4 = new Circle_5();
        System.out.println("Circumference Circle 1: "+c1.circumference());
        System.out.println("Area Circle 1: "+c1.area());
        System.out.println("Circumference Circle 1: "+c2.circumference());
        System.out.println("Area Circle 1: "+c2.area());
        System.out.println("Circumference Circle 1: "+c3.circumference());
        System.out.println("Area Circle 1: "+c3.area());
        System.out.println("Circumference Circle 1: "+c4.circumference());
        System.out.println("Area Circle 1: "+c4.area());
    }
}
