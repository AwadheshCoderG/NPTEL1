/* Demontration of constructor Overloading */
// Edit Demonstration_39.java
package NPTEL1;

class Circle_4{
    double x, y;
    double r;
    Circle_4(double a, double b, double c){
        x = a;
        y = b;
        r = c;
    }
    Circle_4(double c){
        x = 0.0;
        y = 0.0;
        r = c;
    }
    Circle_4(Circle_4 c){
        x = c.x;
        y = c.y;
        r = c.r;
    }
    Circle_4(){
        x = 0.0;
        y = 0.0;
        r = 1.0;
    }
    double circumference(){
        return 2 * 3.14159 * r;
    }
    double area(){
        return (22/7)*r*r;
    }
}
class Demonstration_39 {
    public static void main(String[] args) {
        Circle_4 c1 = new Circle_4(3.0, 4.0, 5.0);
        Circle_4 c2 = new Circle_4(5.0);
        Circle_4 c3 = new Circle_4(c1);
        Circle_4 c4= new Circle_4();
        System.out.println("Circumference Circle 1: "+c1.circumference());
        System.out.println("Area Circle 1: "+c1.area());
        System.out.println("Circumference Circle 2: "+c2.circumference());
        System.out.println("Area Circle 2: "+c2.area());
        System.out.println("Circumference Circle 3: "+c3.circumference());
        System.out.println("Area Circle 3: "+c3.area());
        System.out.println("Circumfrence Circle 4: "+c4.circumference());
        System.out.println("Area Circle 4: "+c4.area());
    }
}
