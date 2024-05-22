
/* Encapsulation: Utilization of objects in a program */
package NPTEL1;
class Point_3{
    int x, y;
    void getPoint(int a, int b){
        x = a;
        y = b;

    }
}
class Demonstration_37 {
    static double distance;

    public static void main(String[] args) {
        Point_3 p1 = new Point_3();
        Point_3 p2 = p1;
        Point_3 p3 = new Point_3();
        Point_3 p4 = new Point_3();

        p1.getPoint(5, 10);
        p2.getPoint(15, 20);
        p3.getPoint(20, 30);
        p4.getPoint(30, 40);

        System.out.println("X1 = "+p1.x+" Y1 = "+p1.y);
        System.out.println("X2 = "+p2.x+" y2 = "+p2.y);
        int dx = p3.x - p4.x;
        int dy = p3.y - p4.y;
        distance = Math.sqrt(dx * dx + dy * dy);
        System.out.println("Distance = "+ distance);
    }
}
