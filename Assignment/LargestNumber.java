// Write Java program to read the three integers a, b and c from the keyboard and then print the largest value read
package Assignment;
import java.util.Scanner;

class LargestNumber {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer a: ");
        a = sc.nextInt();
        System.out.println("Enter integer b: ");
        b = sc.nextInt();
        System.out.println("Enter integer c: ");
        c = sc.nextInt();
        if(a > b  && a > c){
            System.out.printf("Integer a = %d is largest value.", a);
        }
        else if(b > a && b > c){
            System.out.printf("Integer b = %d is largest value.", b);
        }else{
            System.out.printf("Integer c = %d is largest value.", c);
        }
    }
}

