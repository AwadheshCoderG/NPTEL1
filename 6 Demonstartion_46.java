package NPTEL1;

/*The following program snippet shows how to read and write to the console.*/
//Edit Demonstration_46.java
import java.util.Scanner;
class Demonstartion_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to find the area of circle");
        System.out.println("Please enter the radius of the circle: ");
        double r = sc.nextDouble();
        double area = 3.14 * r * r;
        System.out.println("Area of circle is: "+ area);
    }
}
