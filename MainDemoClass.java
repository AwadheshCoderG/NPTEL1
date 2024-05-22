package NPTEL1;

public class MainDemoClass {
    public static void main(String[] args) {
        Student s = new Student("Awadhesh",20, 01,"Information Technology");
        Employee e = new Employee("Abhishek", 24, 02,"12-06-2023");
        Staff s1 = new Staff("Abhinav",34,03,"10-04-2014","Technical");
        Faculty f = new Faculty("Ankush",25,04,"15-07-2022","Assistant Professor");
        s.show();
        System.out.println("*******************************\n");
        e.show();
        System.out.println("*******************************\n");
        s1.show();
        System.out.println("*******************************\n");
        f.show();
        System.out.println("*******************************\n");
    }
}
