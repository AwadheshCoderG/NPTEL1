/* Example of method-overiding */
package NPTEL1;
class AN{
    public void msg1(){
        System.out.println("Class A: Public!");
    }
    private void masg2(){
        System.out.println("Class A: Private!");
    }
    protected void msg3(){
        System.out.println("Class A: Protected!");
    }
}
class Demonstration_716 {

    void msg(){
        System.out.println("Class main: Welcome!");
    }
    public void msg1(){ // If modifier is set to default it cannot override.
        System.out.println("Overriding public method");
    }

    // If modifire is set to private it can be overidden.
    void msg2(){
        System.out.println("Overriding private method.");
    }
    public void msg3(){
        System.out.println("Overriding protected method!");
    }


    public static void main(String[] args) {
        Demonstration_716 obj = new Demonstration_716();
        obj.msg();
//        obj.msg1();
//        obj.msg2();
//        obj.msg3();

    }
}
