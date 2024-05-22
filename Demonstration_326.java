/* Example queue */
package NPTEL1;
import java.util.*;
class Demonstration_326 {
    public static void main(String[] args) {
    Queue qe = new LinkedList();
    qe.add("b");
    qe.add("a");
    qe.add("c");
    qe.add("e");
    qe.add("d");
    // Accesss queue using Iterator
        Iterator it = qe.iterator();
        System.out.println("Initial size of queue: "+qe.size());
        while(it.hasNext()){
            String iteratorValue = (String) it.next();
            System.out.println("Queue next value: "+iteratorValue);
        }
        // get value and does not remove element from queue
        System.out.println("Queue peek: "+qe.peek());

        // get first value and remove element from queue
        System.out.println("Queue poll: "+qe.poll());

        System.out.println("Final size of queue: "+qe.size());
    }
}
