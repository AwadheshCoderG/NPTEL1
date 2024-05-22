/* Simple example of super concept */
package NPTEL1;
class Box3{
    double width;
    double height;
    double depth;
    Box3(){

    }
    // Constructor used when all dimensions sppecified
    Box3(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    // Compute and return volume
    double volume(){
        return width * height * depth;
    }
}
//BoxWeight3 now fully implements all constructors.
class BoxWeight2 extends Box3{
    double weight;
    // Constructor used when all parameters are specified
    BoxWeight2(double width, double height, double depth, double weight){
        super(width, height, depth);
        this.weight = weight;
    }
}
class Demonstration_64 {
    public static void main(String[] args) {
        BoxWeight2 mybox1 = new BoxWeight2(10, 20, 15, 34.3);
        BoxWeight2 mybox2 = new BoxWeight2(2, 3, 4, 0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is: "+ vol );
        System.out.println("Weight of mybox1 is: "+mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Volume of nybox2 is: "+vol);
        System.out.println("Weight of mybox2 is: "+mybox2.weight);
        System.out.println();
    }
}
