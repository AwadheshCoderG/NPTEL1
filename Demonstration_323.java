/* Example Vector */
package NPTEL1;
import java.util.Vector;
import java.util.Enumeration;
class Demonstration_323 {
    public static void main(String[] args) {
        Vector<Object> vector = new Vector<Object>();
        int primitiveType = 10;
        Integer wrapperType = new Integer(20);
        String str = "Tapan joshi";
        vector.add(primitiveType);
        vector.add(wrapperType);
        vector.add(str);
        vector.add(2, new Integer(30));
        System.out.println("The elements of vector: "+vector);
        System.out.println("The size of vector are: "+vector.size());
        System.out.println("The elements at position 2 is: "+vector.elementAt(2));
        System.out.println("The first element of vector is: "+vector.firstElement());
        System.out.println("The last element of vector is: "+vector.lastElement());
        vector.removeElement(2);

        Enumeration e = vector.elements();
        System.out.println("The elements of vector is: "+vector);
        while(e.hasMoreElements()){
            System.out.println("The elements are: "+e.nextElement());
        }
    }
}
