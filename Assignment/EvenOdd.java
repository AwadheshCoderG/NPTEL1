// Write a program to check the number is even or odd. Input is taken from keyboard
package Assignment;
import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to whether it is even or odd: ");
        a = sc.nextInt();
        if(a % 2 == 0){
            System.out.printf("%d is even.", a);
        }else{
            System.out.printf("%d is odd.", a);
        }

    }
}
