package NPTEL1;
import java.util.Scanner;
class FindPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean isPrime = true;
        System.out.println("Please enter a number: ");
        num = sc.nextInt();

        for(int i = 2; i < num/2 ; i++){
            if((num % i) == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num +" is prime number.");
        }
        else{
            System.out.println(num +" is not a prime number");
        }
    }
}
