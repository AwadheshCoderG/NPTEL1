/* Avaerage an array of values */
package NPTEL1;

 class Demonstration_315 {
     public static void main(String[] args) {
         double nums[] = { 10.1, 11.2, 12.3, 13.4, 14.5};
         double result = 0.0;
         int i;
         for(i = 0; i < nums.length; i++){
             result += nums[i];
         }
         System.out.println("Average is: "+result / nums.length);
     }
}
