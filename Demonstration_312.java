// Program to demonstrate use of this: to invoke current class method
// Edit Demonstration_312.java
package NPTEL1;
class A{
    void m(){
        System.out.println("Hello m");
    }
    void n(){
        System.out.println("Hello n");
        this.m();
    }
}
class Demonstration_312 {
    public static void main(String[] args) {
        A a= new A();
        a.n();
    }
}
