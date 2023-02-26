
class Thread1 extends Thread{
    public void run(){
        int i=0;
        while(true){
            System.out.println("I love you ");
            i++;
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        int i=0;
        while (true) {
            System.out.println("Thanks");
            i++;
        }
    }
}

public class Practice17 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.setPriority(10);
        t2.setPriority(4);
        t1.start();
        t2.start();
    }
}
