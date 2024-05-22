/* String operation example */
package NPTEL1;

class Demonstration_328 {
    public static void main(String[] args) {

        // construct one string from another
        char c[] = {'j','a','v','a'};
        String s1 = new String(c);
        String s2 = new String(s1);
        System.out.println(s1);
        System.out.println(s2);

        // Calculate String length
        System.out.println(s2.length());

        // use the case function
        System.out.println("toUpperCase: "+ s1.toUpperCase());
        System.out.println("toLowerCase: "+s1.toLowerCase());

        //check for a certain character using indexOf()
        System.out.println("indexOf('s'): "+s1.indexOf('s'));
        System.out.println("indexOf('v'): "+s1.indexOf('v'));
        System.out.println("indexOf('av'): "+s1.indexOf("av"));

        // print out the beginning character using charAt()
        System.out.println("first character: "+s1.charAt(0));

        // Construct string from subset of char array.
        byte ascii[] = {65, 66, 67, 68, 69, 70};
        String s3 = new String(ascii);
        System.out.println(s3);
        String s4 = new String(ascii, 2, 3);
        System.out.println(s4);

        // String concatination
        String age = "9";
        String s = "He is "+ age +" years old";
        System.out.println(s);

        String string1 = "Hi";
        String string2 = new String("Hello");
        if (string1 == string2){
            System.out.println("The string are equal.");
        }else{
            System.out.println("The string are unequal.");
        }
        String str = "Her name is Tamana and Tamana is a good girl.";
        String strreplace = "Sonia";
        String result = str.replaceFirst("Tamana", strreplace);
        System.out.println(result);
    }
}
