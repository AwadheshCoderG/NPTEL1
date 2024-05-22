/* Example of a superclass variable referring to a subclass Object*/
package NPTEL1;

class Box2{
    double width;
    double height;
    double depth;

    Box2(){
        // Default constructor
    }
    // Constructor used when all dimensions specified
    Box2(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    // Volume
    double volume(){
        return width * height * depth;
    }
}
// Here Box2 is extended to include weight.
class BoxWeight1 extends Box2{
    double weight;  // weight of box2

    // Constructor for BoxWeight1
    BoxWeight1(double width, double height, double depth, double weight){
        super(width, height, depth);
        this.weight = weight;
    }
}
class Demonstration_63 {
    public static void main(String[] args) {
        BoxWeight1 weightBox = new BoxWeight1(3, 5, 7, 8.37);
        Box2 plainBox = new Box2();
        double vol;
        vol = weightBox.volume();
        System.out.println("Volume of weighhtBox is: "+vol);
        System.out.println("Weight of weightBox is: "+weightBox.weight);
        System.out.println();

        // Assign BoxWeight reference to Box2 Reference
        plainBox = weightBox;
        vol = plainBox.volume();
        System.out.println("Volume of the Box2 is: "+vol);
        /* The following statement is invalid because plainbox does not define a weight member. */
        // System.out.println("Weight of plainbox is " + plainbox.weight);
    }
}
