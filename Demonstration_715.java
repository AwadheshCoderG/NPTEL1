/* Another example of access modifier with public, private and protected data */
package NPTEL1;
class BaseClass{
    public int x = 10;
    private int y = 10;
    protected int z = 10;
    int a = 10;  // Implicit default access modifier

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }
    private int getY(){
        return y;
    }
    private void setY(int y){
        this.y = y;
    }
    protected int getZ(){
        return z;
    }
    protected void setZ(int z){
        this.z = z;
    }
    int getA(){
        return a;
    }
    void setA(int a){
        this.a = a;
    }
}
class Demonstration_715 extends BaseClass {
    public static void main(String[] args) {
        BaseClass rr = new BaseClass();
        rr.z = 0;
        Demonstration_715 subClassObj = new Demonstration_715();
        // Access Modifiers - public
        System.out.println("Value of x is: "+subClassObj.x);
        subClassObj.setX(20);
        System.out.println("Vlaue of x is: "+subClassObj.x);

        // Access Modifiers - private
        // If we remove the comments it would result in compilation error as the field
        // and methods being accessed are private

       /* System.out.println("Value of y is: "+subClassObj.y);
        subClassObj.setY(20);
        System.out.println("Value of y is: "+subClassObj.y);*/

        // Access Modifiers - protected
        System.out.println("Value of z is : "+subClassObj.z);
        subClassObj.setZ(30);
        System.out.println("Value of Z is : "+subClassObj.z);

        // Access Modifier - Default
        System.out.println("Value of a is : "+subClassObj.a);
        subClassObj.setA(20);
        System.out.println("Value of a is : "+subClassObj.a);
    }
}
