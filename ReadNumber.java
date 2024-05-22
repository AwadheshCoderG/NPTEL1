/*
This is a Java Application to read a number from the standard input * and display the number.
*/
// ReadNumber.java

package NPTEL1;
import java.io.*;
class ReadNumber {
    public static void main(String[] args) {
        Float number1 = null;
        Float number2 = null;
        try {

            DataInputStream in = new DataInputStream(System.in);
            String tempString;
            System.out.println("Enter first number: ");
            System.out.flush();
            tempString = in.readLine();
            number1 = Float.valueOf(tempString);

            System.out.println("Enter second number: ");
            System.out.flush();
            tempString = in.readLine();
            number2 = Float.valueOf(tempString);

            System.out.println("First number: "+ number1 +"\n"+"Second number: "+ number2);
        }
        catch(Exception e){

        }
    }
}
