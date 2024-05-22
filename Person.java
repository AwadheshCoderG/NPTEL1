package NPTEL1;

public class Person {
    private String name;
    private int age;
    public Person(){
        this.name = "null";
        this.age = 0;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }
}
