/*
Application with more than one classes within same java file
*/
//Edit PeopleApp.java

package NPTEL1;

class FirstClass{
    int idNo;
   public FirstClass(){
       idNo = 555;
   }
    public void print(){
        System.out.println("First class citizen " + idNo);
    }
}

class SecondClass{
    int idNo;
    public SecondClass() {
        idNo = 111;
    }
    public void print(){
        System.out.println("Second class citizen " + idNo);
    }
}
public class PeopleApp {
    public static void main(String[] args) {
        FirstClass female = new FirstClass();
        SecondClass male = new SecondClass();
        System.out.println("People from java world");
        female.print();
        male.print();
    }
}
