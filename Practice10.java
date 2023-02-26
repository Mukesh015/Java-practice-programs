

class A {

    private int x;
    A(){
        x=90;
    }
    A(int x){
        this.x=x;
    }
    void display(){
        System.out.println(x);
    }
}

class B extends A {
    B(int x) {
        super(x);
        System.out.println("I am derived class constructor " + x);
    }
}

public class Practice10 {

    public static void main(String[] args) {
        A a=new A();
        a.display();
        B b = new B(10);
        b.display();
    }

}

// package com.company;

// import javax.print.Doc;

// class EkClass {
//     int a;

//     public int getA() {
//         return a;
//     }

//     EkClass(int a) {
//         this.a = a;
//     }

//     public int returnone() {
//         return 1;
//     }
// }

// class DoClass extends EkClass {
//     DoClass(int c) {
//         super(c);
//         System.out.println("I am a constructor");
//     }
// }

// public class cwh_47_this_super {
//     public static void main(String[] args) {
//         EkClass e = new EkClass(65);
//         DoClass d = new DoClass(5);
//         System.out.println(e.getA());
//     }
// }