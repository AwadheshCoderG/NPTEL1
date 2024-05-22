/* A simple example of inheritance. */
package NPTEL1;
//Create a superclass.
class A2{
    int i , j;
    void showij(){
        System.out.println("i and j: "+i +" "+j);
    }
}
// create a subclass by extending class A.
class B2 extends A2{

    int k;
    void showk(){
        System.out.println("K: "+k);
    }
    void sum(){
        System.out.println("i+j+k: "+(i+j+k));
    }
}
class Demonstartion_61 {
    public static void main(String[] args) {
        A2 superOb = new A2();
        B2 subOb = new B2();
        // The superclass may be used by itself
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superOb: ");
        superOb.showij();
        System.out.println();
        /* the subclass has access to all public members of its superclass. */
        subOb.i = 5;
        subOb.j = 10;
        subOb.k = 15;
        System.out.println("Contents of subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Sum of i, j and k in subOb: ");
        subOb.sum();
    }
}
