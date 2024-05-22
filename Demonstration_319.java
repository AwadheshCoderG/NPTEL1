/* The following program, ArrayCopyDemo, declares an array of char elements,
 spelling the word "decaffeinated". It uses arraycopy to copy a subsequence
  of array components into a second array */
package NPTEL1;

class Demonstration_319 {
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[copyFrom.length];
        System.arraycopy(copyFrom,0,copyTo,0,copyFrom.length);
        String name = String.valueOf(copyTo);
        System.out.println(name);
        System.out.println(new String(copyTo));
    }

}
