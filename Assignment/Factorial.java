// Write java program to calculate the Factorial of a 10 (iteratively and recursively).
package Assignment;

class Factorial {

    public static int factorialIterative(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public static int factorialRecursive(int n) {
        if (n == 1 || n < 0) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }
    public static void main(String[] args) {
        int number = 10;
        int factIter = factorialIterative(number);
        int factRec = factorialRecursive(number);
        System.out.println("Factorial of "+ number +" from iterative method: "+ factIter);
        System.out.println("Factorial of "+ number +" from recursive method: "+ factRec);
    }
}
