// Write java program to calculate the Square of a number.
package Assignment;

import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
        float number, square;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to calculate the square: ");
        number = sc.nextFloat();
        square = number * number;
        System.out.println("Square of number is: "+ square);
    }

}
