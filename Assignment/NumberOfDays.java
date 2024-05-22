// Write a program to find out the number of days in a month using switch-case.
// Month number and year is taken as input through keyboard.
package Assignment;
import java.util.Scanner;
class NumberOfDays {
    public static void main(String[] args) {
        int month, year;
        System.out.println("Welcome to check the number of days in a month.");
        System.out.println("_______________________________________________\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        year = sc.nextInt();
        System.out.println("Choose the Month:\n 1.January\n 2.February\n 3.March\n 4.April\n 5.May\n 6.June\n" +
                " 7.July\n 8.August\n 9.September\n 10.October\n 11.November\n 12.December");
        System.out.println("________________________________________________");
        System.out.print("Enter the number of month: ");
        month = sc.nextInt();
        if(year % 400 == 0  || year % 4 == 0){
            switch(month){
                case 1:
                    System.out.println("January: 31");
                    break;
                case 2:
                    System.out.println("February: 29");
                    break;
                case 3:
                    System.out.println("March: 31");
                    break;
                case 4:
                    System.out.println("April: 30");
                    break;
                case 5:
                    System.out.println("May: 31");
                    break;
                case 6:
                    System.out.println("June: 30");
                    break;
                case 7:
                    System.out.println("July: 31");
                    break;
                case 8:
                    System.out.println("August: 31");
                    break;
                case 9:
                    System.out.println("September: 30");
                    break;
                case 10:
                    System.out.println("October: 31");
                    break;
                case 11:
                    System.out.println("November: 30");
                    break;
                case 12:
                    System.out.println("December: 31");
                    break;
            }



        }else{
            switch(month){
                case 1:
                    System.out.println("January: 31");
                    break;
                case 2:
                    System.out.println("February: 28");
                    break;
                case 3:
                    System.out.println("March: 31");
                    break;
                case 4:
                    System.out.println("April: 30");
                    break;
                case 5:
                    System.out.println("May: 31");
                    break;
                case 6:
                    System.out.println("June: 30");
                    break;
                case 7:
                    System.out.println("July: 31");
                    break;
                case 8:
                    System.out.println("August: 31");
                    break;
                case 9:
                    System.out.println("September: 30");
                    break;
                case 10:
                    System.out.println("October: 31");
                    break;
                case 11:
                    System.out.println("November: 30");
                    break;
                case 12:
                    System.out.println("December: 31");
                    break;
            }
        }

    }
}
