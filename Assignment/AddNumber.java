// Write java program to add two numbers, take input as command line argument.
package Assignment;
import java.util.Scanner;
class AddNumber {
    public static void main(String[] args) {
        float num1, num2 , add;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any two numbers: ");
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
        add = num1 + num2;
        System.out.println("Addition of number: "+ add);
    }
}
