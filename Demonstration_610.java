// An abstract class without any abstract method
package NPTEL1;
abstract class Base2{
    void fun(){
        System.out.println("Base fun() is called");
    }
}
class Derived2 extends Base2{
    Derived2(){
        System.out.println("Derived Constructor is called");
    }
    void fun(){
        System.out.println("Derived fun() is called");
    }
}
class Demonstration_610 {
    public static void main(String[] args) {
        Derived2 d = new Derived2();
        d.fun();
    }
}
