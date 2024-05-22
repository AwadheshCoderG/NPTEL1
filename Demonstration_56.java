/* Test for primes */
package NPTEL1;
import java.io.*;
class Demonstration_56 {
    public static void main(String args[]) throws IOException{
    int num;
    DataInputStream in = new DataInputStream(System.in);
    boolean isPrime = true;
    num = Integer.parseInt(in.readLine());
    for( int i = 2; i <= num/2; i++){
        if(num % 1 == 0){
            isPrime = false;
            break;
        }
    }
    if(isPrime){
        System.out.println("Prime");
    }else{
        System.out.println("Not Prime");
    }
    }
}
