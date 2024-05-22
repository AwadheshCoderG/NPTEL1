// A program that uses simple Point class and na�ve initialization of its data.
package NPTEL1;

class Point{
    double x;
    double y;
}
class Demonstration_34 {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 10.0;
        p.y = 7.0;
        System.out.println("x: "+ p.x);
        System.out.println("y: "+p.y);
    }
}
