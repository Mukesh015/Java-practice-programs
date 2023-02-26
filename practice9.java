

class Base {
    private int a;

    Base() {
        a = 0;
        System.out.println(a);
    }

    Base(int x) {
        a = x;
        display();
    }

    void display() {
        System.out.println(a);
    }
}

class Derive extends Base{
    private int b,c;
    Derive(){
        super(2);
        b=1;
        c=2;
    }
    Derive(int x,int y){
        super(x);
        b=x;
        c=y;
        System.out.println(x);
    }
}
class Derive1 extends Derive{
    int d;
    Derive1(){
        d=10;
    }
    Derive1(int x){
        super(90,50);
        d=x;
        System.out.println(x);
    }
}

public class practice9 {
    public static void main(String[] args) {
        Base b = new Base(10);
        b.display();
        Derive1 d =new Derive1(40);
    }
}
