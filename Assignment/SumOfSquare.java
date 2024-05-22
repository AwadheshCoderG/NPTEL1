// Write java program to calculate the Sum of the square of first 10 integers.
package Assignment;

class SumOfSquare {
    public static void main(String[] args) {
        int i, sum = 0;
        for(i = 1; i <= 10; i++){
            sum += (i * i);
        }
        System.out.println("\nSum of the square of first 10 integers: "+sum);
    }
}
