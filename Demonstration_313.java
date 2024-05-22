/* Special use of this keyword: No object creation to invoke method
 */
//Edit Demonstration_313.java
package NPTEL1;
class A1{
    A1(int x){
        System.out.println(x);
    }
    A1(){
       this(5);
        System.out.println("Hello a");
    }

}
class Demonstration_313 {
    public static void main(String[] args) {
        A1 a = new A1();

    }
}
