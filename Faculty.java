package NPTEL1;

public class Faculty extends Employee{
    private String designation;
    public Faculty(String name, int age, int ecNo, String doj, String designation){
        super(name, age, ecNo, doj);
        this.designation = designation;
    }

    public void show(){
        super.show();
        System.out.println("Designation: "+designation);

    }
}
