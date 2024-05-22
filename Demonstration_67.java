/* Example of multilevel inheritance. */
package NPTEL1;
// Start with Box.
class Box4{
    private double width;
    private double height;
    private double depth;
    Box4(){
        // Default Constructor
    }
    // Constructor used when all dimensions specified
    Box4(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    // Compute and return the volume
    double volume(){
        return width * height * depth;
    }
}

// Add weight.
class BoxWeight4 extends Box4{
    double weight;
    // Constructor is used when all parameters are specified
    BoxWeight4(double width, double height, double depth, double weight){
       super(width, height, depth);  // Call Superclass Constructor
       this.weight = weight;
    }
}
// Add Shpping cost
class Shipment extends BoxWeight4{
    double cost;
    // Constructor is used when all parameters are specified
    Shipment(double width, double height, double depth, double weight, double cost){
        super(width, height, depth, weight); // Call Superclass Constructor
        this.cost = cost;
    }
}
class Demonstration_67 {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.14);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;
        vol = shipment1.volume();
        System.out.println("Volume of shipment1: "+vol);
        System.out.println("Weight of shipment1: "+shipment1.weight);
        System.out.println("Shipping cost: $"+shipment1.cost);
        vol = shipment2.volume();
        System.out.println("Volume of shipment2: "+vol);
        System.out.println("Weight of shipment2: "+shipment2.weight);
        System.out.println("Shipping cost: $"+shipment2.cost);
    }
}
