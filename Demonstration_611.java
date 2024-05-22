// Final Class Inheritance � An Example
package NPTEL1;
// Final class can not be inherited
/* final */class Bike{

}
class Honda1 extends  Bike{
    void run(){
        System.out.println("Running safely with 100kmph");
    }
}
class Demonstration_611 {
    public static void main(String[] args) {
        Honda1 h = new Honda1();
        h.run();
    }
}
