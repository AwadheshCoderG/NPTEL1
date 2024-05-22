/* Example: convert an ArrayList into array */
package NPTEL1;
import java.util.*;
class Demonstration_321 {
    public static void main(String[] args) {
        // Create an array list
        ArrayList al = new ArrayList();
        // add elements to the array list
        al.add(new Integer(1));
        al.add(new Integer(2));
        al.add(new Integer(3));
        al.add(new Integer(4));
        System.out.println("Contents of al: "+al);
        // get Array
        Object ia[] = al.toArray();
        int sum = 0;
        // sum the array
        for(int i = 0; i < ia.length; i++){
            sum += (Integer) ia[i];
        }
        System.out.println("Sum of array is: "+sum);

    }
}
