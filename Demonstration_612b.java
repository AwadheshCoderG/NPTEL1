// An abstract class with a final method
package NPTEL1;
abstract class Base4{
    final void fun(){
        System.out.println("Final fum() is called.");
    }
}
class Derived4 extends Base4{
    Derived4()
    {
        System.out.println("Derived Constructor is called.");
    }

// Final methods cannot be overridden
//    void fun(){
//        System.out.println("Derived fun() is called.");
//    }
}
class Demonstration_612b {
    public static void main(String[] args) {
        Derived4 d = new Derived4();
        d.fun();
    }
}
