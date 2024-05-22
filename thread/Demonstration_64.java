/* Use of suspend() and resume() methods */
/*package thread;

class Thread1 extends Thread{
    public void run(){
        System.out.println("First Thread starts running");
        try {
            sleep(10000);
        }catch(Exception e){ }
        System.out.println("First Thread finishes running");
    }
}

class Thread2 extends Thread{
    public void run(){
        System.out.println("Second Thread starts running");
        System.out.println("Second Thread suspended itself");
        suspend();
        System.out.println("Second Thread runs again");
    }
}
public class Demonstration_64 {
    public static void main(String[] args){
        Thread1 first = new Thread1();
        Thread2 second = new Thread2();
        first.start();
        second.start();

        System.out.println("Revive the second thread");
        second.resume();
        System.out.println("Second thread went for 10 seconds sleep");
        second.sleep(10000);
        System.out.println("Wake up thread and finishes running");
        System.out.println("Demonstration is finished");
    }
}*/
