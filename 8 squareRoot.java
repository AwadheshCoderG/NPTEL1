package NPTEL1;
import java.lang.Math;
import java.util.Scanner;
class squareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double x = sc.nextDouble();
        double y ; // Declaring another variable
        y = Math.sqrt(x);
        System.out.println("Square Root of "+ x +" = "+y);
    }
}
