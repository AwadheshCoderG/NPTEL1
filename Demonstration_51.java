/* While loop example */
package NPTEL1;

class Demonstartion_51{
    public static void main(String[] args) {
        System.out.println("Printing first 10 odd numbers.");
        int count = 1;
        while(count < 11){
            System.out.print(" "+((2 * count) - 1));
            count++;
        }
    }
}
