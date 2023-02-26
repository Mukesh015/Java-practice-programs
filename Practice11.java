
class A{
    public int a;
    public void display(){
        System.out.println("I am a method of class A");
    }
}
class B extends A{
    @Override
    public void display(){
        System.out.println("I am a method of class B");
    }
}
public class Practice11 {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}