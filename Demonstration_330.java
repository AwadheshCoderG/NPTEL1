// Method resolution during execution //
package NPTEL1;
class A4{
    void callMe(){
        System.out.println("I am from A4");
    }
}
class B4 extends A4{
    void callMe(){
        System.out.println("I am from B4");
    }
}
class Demonstration_330 {
    public static void main(String[] args) {
        A4 a = new B4();
        a.callMe();
    }
}
