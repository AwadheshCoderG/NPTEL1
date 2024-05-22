// An abstract class with constructor
package NPTEL1;
abstract class Base1{
    Base1(){
        System.out.println("Base constructor is called");
    }
    abstract void fun();
}

class Derived1 extends Base1{
    Derived1(){
        System.out.println("Derived constructor is called");
    }
    void fun(){
        System.out.println("Derived fun() is called");
    }
}
class Demonstration_69 {
    public static void main(String[] args) {
        Derived1 d = new Derived1();
        d.fun();
    }
}
