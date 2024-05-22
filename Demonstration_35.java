/* Encapsulation: Defining a class with method */
package NPTEL1;

class Point_1{
    int x, y;
    void setPoint(){
        x = 10;
        y = 10;
    }
}
class Demonstration_35 {
    public static void main(String[] args) {
        Point_1 p = new Point_1();
        p.setPoint();
        System.out.println("x = "+p.x);
        System.out.println("y = "+p.y);
    }
}
