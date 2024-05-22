/* Implement Stack in Java */
package NPTEL1;
import java.io.*;
import java.util.Stack;
class Demonstration_325 {

    Stack stack;
    String str;
    int num, n;


    public static void main(String[] args) {
        Demonstration_325 q = new Demonstration_325();

    }

    public Demonstration_325(){
        try{
            stack = new Stack();
            InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(ir);
            System.out.println("Enter numbers of elements: ");
            str = br.readLine();
            num = Integer.parseInt(str);
            for(int i = 1; i <= num; i++){
                System.out.println("Enter elements: ");
                str = br.readLine();
                n = Integer.parseInt(str);
                stack.push(n);
            }
        }catch(IOException e){ }

        System.out.println("Retrieved elements from the stack: ");
        while(!stack.isEmpty()){
            System.out.println(stack.pop()+" ");
        }
    }
}
