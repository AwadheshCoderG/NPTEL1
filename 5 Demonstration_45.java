package NPTEL1;
import java.util.Scanner;
class Demonstration_45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to check the maximum number.");
        System.out.println("Please enter two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b){
            System.out.printf("Between %d and %d , maximum number is %d.", a, b, a);
        }
        else{
            System.out.printf("Between %d and %d, maximum number is %d.", a, b, b);
        }

    }
}
