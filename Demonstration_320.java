/* Example ArrayList */
package NPTEL1;
import java.util.*;
class Demonstration_320 {
    public static void main(String[] args) {
        // create an array list
        ArrayList al = new ArrayList();
        System.out.println("Initial size of al: "+al.size());
        // add elements to array list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        // Display the array list
        System.out.println("Contents of al: "+al);
        al.add(1,"A2");
        System.out.println("Size of al after additions: "+al.size());

        // Display the array list
        System.out.println("Contents of al: "+al);
        System.out.println("Index of D: "+al.indexOf("D"));
        System.out.println("Value at 2: "+al.size());
        System.out.println("The second element is: "+al.get(1));
        System.out.println("The third element is: "+al.get(2));

        // Remove element from array list
        al.remove("F");
        System.out.println("Size of al after deletion: "+al.size());

        // Display the array list
        System.out.println("Contents of al: "+al);

        // Replacing an elemnt at particular index
        al.set(2,"G");
        System.out.println("Size of al after deletion: "+al.size());

        // Display the array list
        System.out.println("Contents of al: "+al);

        // Remove element from array list
        al.remove(2);
        System.out.println("Size of al after deletion: "+al.size());
        System.out.println("Contents of al: "+al);

        // Remove all elements from the array list
        al.clear();
        System.out.println("Size of al after deletion: "+al.size());
        System.out.println("Contents of al: "+al);
    }
}
