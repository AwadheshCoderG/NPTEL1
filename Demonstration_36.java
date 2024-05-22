/* Automatic  initialization in Java through the constructor as in C++*/
/* Encapsulation: Defining a class having method with parameter */
package NPTEL1;
class Point_2{
    int x, y;
    void setPoint(int a, int b){
        x = a;
        y = b;
    }
}
// definition of another class. This is a main class
class Demonstration_36 {
    public static void main(String[] args) {
        Point_2 p1 = new Point_2();
        Point_2 p2 = new Point_2();
        p1.setPoint(15, 20);
        p2.setPoint(0, 0);
        System.out.println("x = "+p1.x);
        System.out.println("y = "+p1.y+"\n");
        System.out.println("x = "+p2.x);
        System.out.println("y = "+p2.y);
    }

}
