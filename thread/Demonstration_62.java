/* Practice of a multithreaded program using Runnable interface */
package thread;

class ThreadX implements Runnable{
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Thread X with i = "+ i);
        }
        System.out.println("Exiting from Thread X ...");
    }
}

class ThreadY implements Runnable{
    public void run(){
        for(int j = 1; j <= 5; j++){
        System.out.println("thread Y with j = "+ j);
        }
        System.out.println("Exiting from Thread Y ...");
    }
}

class ThreadZ implements Runnable{
    public void run(){
        for(int k = 1; k <= 5; k++){
            System.out.println("Thread Z with k = "+ k);
        }
        System.out.println("Exiting from Thread Z ...");
    }
}
public class Demonstration_62 {
    public static void main(String[] args) {
        ThreadX x = new ThreadX();
        Thread t1 = new Thread(x);
        ThreadY y = new ThreadY();
        Thread t2 = new Thread(y);
        ThreadZ z = new ThreadZ();
        Thread t3 = new Thread(z);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Multithreading is over...");
    }
}
