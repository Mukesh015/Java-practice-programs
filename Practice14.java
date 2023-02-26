

abstract class Cycle{

    public void name(){
        System.out.println("This is normal cycle");
    }
    abstract public void horn();
    abstract public void silencer();
    abstract public void speed(int x);
}
class Cycle1{

    public void name(){
        System.out.println("This is normal cycle");
    }
    public void horn2(){};
    public void silencer2(){};
    public void speed2(int x){};
}

class Bicycle extends Cycle{
    public void horn(){
        System.out.println("pee peee ....");
    }
    public void silencer(){
        System.out.println("This is silencer");
    }
    public void speed(int x){
        System.out.println("Bicycle speed is "+x);
    }
    void stand(){
        System.out.println("I am a stand");
    }
}


interface Bike {

    void horn();
    void silencer();
    void speed(int x);
    void stand();
}
interface TwoWheeler {

    void horn1();
    void silencer1();
    void speed1(int x);
    void stand1();
}

class Pulser implements Bike,TwoWheeler{
    public void horn(){
        System.out.println("pee peee ....");
    }
    public void silencer(){
        System.out.println("I am a silencer");
    }
    public void speed(int x){
        System.out.println("Bicycle speed is "+x);
    }
    public void stand(){
        System.out.println("I am a stand");

    }
    public void horn1(){
        System.out.println("I am a double horn");
    }
    public void silencer1(){
        System.out.println("I am a double silencer");
    }
    public void speed1(int x){
        System.out.println("My speeed is "+x);
    }
    public void stand1(){
        System.out.println("I am double stand");
    }
}

// class Derive extends Cycle1 implements Bike,TwoWheeler{

// } --> correct way to define

public class Practice14{
    public static void main(String[] args) {
        // Cycle bc = new Bicycle();
        // bc.horn();
        // bc.silencer();;
        // bc.stand();; --> error
        // bc.speed(200);
        // bc.name();
        
    }
}