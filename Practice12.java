

class phone{
    void ring(){
        System.out.println("Ringing...");
    }
    void date(){
        System.out.println("12:00 pm");
    }
    void name(){
        System.out.println("This is phone");
    }
}

class Smartphone extends phone{
    void ring(){
        System.out.println("Ringing... in smartphone");
    }
    void date(){
        System.out.println("14:00 pm");
    }
    void name(){
        System.out.println("This is smartphone");
    }
    void music(){
        System.out.println("playing music...");
    }
}

public class Practice12 {
    public static void main(String[] args) {
        phone samsung = new Smartphone();
        samsung.name();
        samsung.ring();
        samsung.date();
    }
}
