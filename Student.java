package NPTEL1;

public class Student extends Person {
    private int roll_No;
    private String branch;
    public Student(String name, int age, int roll_No, String branch){
        super(name, age);
        this.roll_No = roll_No;
        this.branch = branch;
    }
    public void show(){
        super.show();
        System.out.println("Roll_No: "+roll_No+"\n"+"Branch: "+branch);
    }
}
