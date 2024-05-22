// An abstract class without any abstract method
package NPTEL1;
abstract class Base3{
    void fun(){
        System.out.println("Base fun() is called");
    }
}
class Derived3 extends Base3{
    Derived3(){
        System.out.println("Derived Constructor is called.");
    }
    void fun()
    {
        System.out.println("Derived fun() is called.");
    }
}
class Demonstration_612 {
    public static void main(String[] args) {
        Derived3 d = new Derived3();
        d.fun();
    }
}
