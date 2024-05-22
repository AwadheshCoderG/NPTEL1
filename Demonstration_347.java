// Static extent of a variable or method //
package NPTEL1;
class Student1{
    static int b;
    Student1(){
        // Constructor incrementing static variable b
        b++;
    }

    public static void showData(){
        System.out.println("Value of b: "+b);
    }
}
public class Demonstration_347 {
    public static void main(String[] args) {
        int b = 0;
        System.out.println("Value of b: "+b);
        Student1 s1 = new Student1();
        s1.showData();
        Student1 s2 = new Student1();
        s2.showData();
    }
}
