/* Inheritance example: initializing through constructor */
package NPTEL1;

class Box1{
    double width;
    double height;
    double depth;
    Box1(){
        //Default string by this constructor
        width = 0.0;
        height = 0.0;
        depth = 0.0;
    }
    Box1(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double volume(){
        // compute and return volume
        return width * height * depth;
    }
}

// Here Box1 is extended to include the weight.
class BoxWeight extends Box1{
    double weight;  // weight of box
    // constructor for boxweight.
    BoxWeight(double width, double height, double depth, double weight){
        super(width, height, depth);
        this.weight = weight;
    }
}
class Demonstration_62a {
    public static void main(String[] args) {
        Box1 myBox1 = new Box1();
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is: "+vol);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is: "+vol);
        System.out.println("Weight of myBox2 is: "+myBox2.weight);
    }
}
