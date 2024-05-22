/* Setting priority to threads */
package thread;
class ClassD extends Thread{
    public void run(){
        System.out.println("Start Thread D....");
        for(int i = 1; i <= 5; i++){
            System.out.println("From Thread A: i = "+ i);
        }
        System.out.println(".... Exit Thread A");
    }
}

class ClassE extends Thread{
    public void run(){
        System.out.println("Start Thread E...");
        for(int j = 1; j <= 5; j++){
            System.out.println("From Thread E: j = "+j);
        }
        System.out.println("... Exit Thread E");
    }
}

class ClassF extends Thread{
    public void run(){
        System.out.println("Start Thread F......");
        for(int k = 1; k <= 5; k++){
            System.out.println("From Thread F: k = "+ k);
        }
        System.out.println(".... Exit Thread F");
    }
}
public class Demonstration_65 {
    public static void main(String[] args) {
        ClassD t1 = new ClassD();
        ClassE t2 = new ClassE();
        ClassF t3 = new ClassF();

        t3.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.currentThread().getPriority() + 1);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("... End of execution");
    }
}

