/* Use of yield(), stop() and sleep() methods */
package thread;


class ClassA extends Thread{
    public void run(){
        System.out.println("Start Thread A .....");
        for(int i = 1; i <= 5; i++){
            if(i == 1){
                Thread.yield();
            }
            System.out.println("From Thread A: i = "+ i);
        }
        System.out.println(".... Exit Thread A");
    }
}

class ClassB extends Thread{
    public void run(){
        System.out.println("Start Thread B ......");
        for(int j = 1; j <= 5; j++){
            System.out.println("From Thread B: j = "+ j);
            if(j == 2){
                stop();
            }
        }
        System.out.println(".... Exit Thread B");
    }
}

class ClassC extends Thread{
    public void run(){
        System.out.println("Start Thread C ......");
        for(int k = 1; k <= 5; k++){
            System.out.println("From Thread C: k = "+ k);
            if(k == 3){
                try{
                    sleep(3000);
                }catch(Exception e){}
            }
        }
        System.out.println(".... Exit Thread C");
    }
}
public class Demonstration_63 {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();
        a.start();
        b.start();
        c.start();
        System.out.println(".. End Of Execution");
    }
}
