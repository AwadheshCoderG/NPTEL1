/* Implement queue in java */
package NPTEL1;
import java.util.LinkedList;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class Demonstration_327 {
    LinkedList list;
    String str;
    int num;

    public static void main(String[] args) {
        Demonstration_327 q = new Demonstration_327();
    }

    public Demonstration_327(){
        try{
            list = new LinkedList();
            InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(ir);
            System.out.println("Enter number of elements: ");
            str = br.readLine();
            num = Integer.parseInt(str);
            if(num == 0){
                System.out.println("You have enter either zero/null");
                System.exit(0);
            }
            else{
                System.out.println("Enter elements: ");
                for(int i = 1; i <= num; i++){
                    str = br.readLine();
                    int n = Integer.parseInt(str);
                    list.add(n);
                }
            }

            System.out.println("First element: "+list.removeFirst());
            System.out.println("Last element: "+list.removeLast());
            System.out.println("Rest element in list: ");
            while(!list.isEmpty()){
                System.out.println(list.remove()+"\t");
            }

        }
        catch(IOException e){
            System.out.println(e.getMessage() +" is not a legel entry.");
            System.exit(0);
        }
    }
}
