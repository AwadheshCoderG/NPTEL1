/*Write a program to calculate the grade of a student. There are five subjects. Marks in each subject are entered from keyboard.
Assign grade based on the following rule:
total Marks >= 90 	Grade: Ex
90 > Total Marks >= 80 	Grade: A
80 > Total Marks >= 70 	Grade: B
70 > Total Marks >= 60 	Grade: C
60 > Total Marks  	Grade: F */
package Assignment;
import java.util.Scanner;
class Grade {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate the grade");
        System.out.println("____________________");
        System.out.print("Enter the Total Marks: ");
        marks = sc.nextInt();
        if(marks >= 90){
            System.out.println("Marks: "+marks+" Grade: Ex");
        }else if(marks < 90  && marks >= 80){
            System.out.println("Marks: "+marks+" Grade: A");
        }else if(marks < 80 && marks >= 70){
            System.out.println("Marks: "+marks+" Grade: B");
        }else if(marks < 70 && marks >= 60){
            System.out.println("Marks: "+marks+" Grade: C");
        }else{
            System.out.println("Marks: "+marks+" Grade: F");
        }
    }
}
