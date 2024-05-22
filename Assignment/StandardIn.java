// Write java program to multiply two numbers, numbers should be taken from standard input.
package Assignment;
import java.io.*;
class StandardIn {
    public static void main(String[] args) {
        Float num1 = null;
        Float num2 = null;
        float multi = 0;
        try {
            DataInputStream in = new DataInputStream(System.in);
            String tempString;
            System.out.println("Enter first number: ");
            System.out.flush();
            tempString = in.readLine();
            num1 = Float.valueOf(tempString);

            System.out.println("Enter second nummber: ");
            System.out.flush();
            tempString = in.readLine();
            num2 = Float.valueOf(tempString);

            multi = num1 * num2;
            System.out.println("Multiplication of numbers: "+ multi);
        }
        catch(Exception e){ }

    }
}
