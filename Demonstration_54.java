/* Loop  example with continue */
package NPTEL1;

class Demonstration_54 {
    public static void main(String[] args) {
        int count;
        for(count = 0; count < 10; count++){
            System.out.print(" "+count);
            if(count % 2 == 0){
                continue;
            }
            System.out.println();
        }
    }
}
