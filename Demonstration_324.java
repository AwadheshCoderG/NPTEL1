/* Example Stack class */
package NPTEL1;
import java.util.Stack;
class Demonstration_324 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(new Integer(10));
        stack.push("a");
        System.out.println("The contents of stack is: "+stack);
        System.out.println("The siaze of a stack is: "+stack.size());
        System.out.println("The number poped out is: "+stack.pop());
        System.out.println("The number poped out is: "+stack.pop());
//        System.out.println("The number poped out is: "+stack.pop());
        System.out.println("The contents of stack is: "+stack);
        System.out.println("The size of a stack is: "+stack.size());
    }
}
