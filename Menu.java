package NPTEL1;
import java.util.Scanner;
import java.io.*;
class Menu {
    public static void main(String[] args) throws IOException {
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("_____________________________");
            System.out.println("Help on: \n");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. while");
            System.out.println("4. do while");
            System.out.println("5. for");
            System.out.println("______________________________");
            choice =  sc.nextInt();
        }
        while(choice < 1 || choice > 5 );

        System.out.println();

        switch(choice){
            case 1:
                System.out.println("The if: \n");
                System.out.println("________________Syntax_____________\n");
                System.out.println("if(condition){ Statement }");
                System.out.println("else{  statement }");
                System.out.println("____________________________________");
                break;
            case 2:
                System.out.println("The switch: \n");
                System.out.println("________________Syntax_______________\n");
                System.out.println("switch(expression) {");
                System.out.println(" case constant: statement sequence");
                System.out.println("break;");
                System.out.println("\\........");
                System.out.println(" } ");
                System.out.println("____________________________________\n");
                break;
            case 3:
                System.out.println("The while: \n");
                System.out.println("__________________Syntax_______________\n");
                System.out.println("while(condition){ ");
                System.out.println(" statement;");
                System.out.println("____________________________________");
                break;
            case 4:
                System.out.println("The do while: \n");
                System.out.println("_____________________Syntax_______________\n");
                System.out.println("do{  statement }");
                System.out.println("while(condition);");
                System.out.println("____________________________________");
                break;
            case 5:
                System.out.println("The for: \n");
                System.out.println("_________________Syntax___________________\n");
                System.out.println("for(initialize ; condition; iteration)");
                System.out.println("____________________________________");
                break;
        }
    }
}
