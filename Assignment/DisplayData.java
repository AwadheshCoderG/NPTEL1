// Write a Java Application to read the name of a student (studentName), roll Number
// (rollNo) and marks (totalMarks) obtained. rollNo may be an alphanumeric string.
// Display the data as read..
package Assignment;
import java.util.Scanner;
class DisplayData {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Students data: ");
        n = sc.nextInt();
        sc.nextLine();

        String studentName[] = new String[n];
        String  rollNo[] = new String[n];
        int totalMarks[] = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Name: ");
            studentName[i] = sc.nextLine();
            System.out.println("Roll: ");
            rollNo[i] = sc.nextLine();
            System.out.println("TotalMarks: ");
            totalMarks[i] = sc.nextInt();
            sc.nextLine();
        }
        for(int i = 0; i < n; i++){
            System.out.println("Name: "+studentName[i]+"\t\t"+"Roll: "+rollNo[i]+"\t\t"+"TotalMarks: "+totalMarks[i]+"\n");
        }
    }
}
