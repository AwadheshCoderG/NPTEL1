/* Loop example with break*/
package NPTEL1;

public class Demonstration_55 {
    public static void main(String[] args) {
        for(int i = 1;  ; i++){
            System.out.println("i: "+i);
            if(i == 10){
                break;
            }

        }
        System.out.println("Loop Complete.");
    }
}
