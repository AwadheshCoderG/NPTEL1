// Polymorphism concept //
package NPTEL1;
class Point1{
    int x, y;
    // It is a Constructor
    Point1(int x, int y){
        this.x = x;
        this.y = y;
    }
/*M1*/ float distance(int x, int y){
    int dx = this.x - x;
    int dy = this.y - y;
    return (float) Math.sqrt(dx * dx + dy * dy);
}

/*M2*/  float distance(Point1 p){  // Overloaded definition of distance .
    return distance(p.x, p.y);
}
}

class Point3D extends Point1{
    int z;
    Point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }
    /* M3 */
    float distance(int x, int y, int z){
        int dx = this.x - x;
        int dy = this.y - y;
        int dz = this.z - z;
        return (float) Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
    /* M4 */
    float distance(Point3D pt){
        return distance(pt.x, pt.y, pt.z);
    }
}

class Demonstration_329 {
    public static void main(String[] args) {
        Point1 p1 = new Point1(10, 5);  // 2-D point
        Point1 p2 = new Point3D(5, 10, 5); // 3-D point
        Point1 p3 = new Point1(4, 1); // another 2-D point
        Point1 p4 = new Point3D(2, 3,4); // another 3-D point
        float d0 = p1.distance(0,0);  // M1 will be referred
        float d1 = p1.distance(p2);   // M2 will be referred
        System.out.println("Distance from p2 to origin = "+d0);
        System.out.println("Distance from p2 to p1 = "+d1);
        d1 = p4.distance(p3); //M4 will be referred
        System.out.println("Distance from p3 to p4 = "+d1);
    }
}
