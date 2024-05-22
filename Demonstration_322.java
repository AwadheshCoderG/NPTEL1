/* Example LinkList */
package NPTEL1;
import java.util.*;
class Demonstration_322 {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.add("a");
        link.add("b");
        link.add(new Integer(10));
        System.out.println("The contents of list is: "+link);
        System.out.println("The size of linked list is: "+link.size());

        link.addFirst(new Integer(20));
        System.out.println("The contents of list is: "+link);
        System.out.println("The size of linked list is: "+link.size());

        link.add("c");
        System.out.println("The contents of list is: "+link);
        System.out.println("The size of linked list is: "+link.size());

        link.add(2, "j");
        System.out.println("The contents of list is: "+link);
        System.out.println("The size of llinked list is: "+link.size());

        link.add(1,"t");
        System.out.println("The contents of list is: "+link);
        System.out.println("The size of llinked list is: "+link.size());

        link.remove(3);
        System.out.println("The contents of list is: "+link);
        System.out.println("The size of llinked list is: "+link.size());

        // Access element using iterator
        Iterator iterator;
        // create a iterator
        iterator = link.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }
        System.out.println();
        // check list is empty or not
        if(link.isEmpty()){
            System.out.println("Linked list is empty");
        }else{
            System.out.println("Linked list size: "+link.size());
        }
    }
}
