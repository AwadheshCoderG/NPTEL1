/* Example-1 of default access modifier */
//Save the following classes in the same file named as Demonstration_71.java
package NPTEL1;
class A5{
    void msg(){
        System.out.println("Hi! I am in class A5");
    }
}
class Demonstration_71 {
    public static void main(String[] args) {
        A5 a = new A5();
        a.msg();
    }
}
