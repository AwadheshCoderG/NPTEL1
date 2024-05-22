package NPTEL1;

public class Employee extends Person{
    private int ecNo;
    private String doj;
    public Employee(String name, int age,int ecNo, String doj){
        super(name, age);
        this.ecNo = ecNo;
        this.doj = doj;

    }
    public void show(){
        super.show();
        System.out.println("Employee Code Number: "+ecNo+"\n"+"Date of joining: "+doj);

    }
}
