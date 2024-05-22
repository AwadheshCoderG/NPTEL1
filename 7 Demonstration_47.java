package NPTEL1;
/*Input with DataInputStream InterestCalculator Program */
//Edit Demonstration_47.java
import java.io.*;
class Demonstration_47 {
    public static void main(String[] args) throws IOException {
        Float principleAmount = null;
        Float rateOfInterest = null;
        int numberOfYears = 0;
        try{
            DataInputStream  in = new DataInputStream(System.in);
            String tempString;
            System.out.println("Enter principle amount: ");
            System.out.flush();
            tempString = in.readLine();
            principleAmount = Float.valueOf(tempString);

            System.out.println("Enter rate of interest: ");
            System.out.flush();
            tempString = in.readLine();
            rateOfInterest = Float.valueOf(tempString);

            System.out.println("Enter years: ");
            System.out.flush();
            tempString = in.readLine();
            numberOfYears = Integer.parseInt(tempString);

            // Calculate the simple interest
            float interestTotal = (principleAmount * rateOfInterest * numberOfYears) / 100;
            System.out.println("Simple interest: "+ interestTotal);

        }
        catch(Exception e){ }
    }
}
