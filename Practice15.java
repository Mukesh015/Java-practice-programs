
abstract class Pen {

    abstract void write();

    abstract void rifil(String color);
}

class fountainPen extends Pen {
    public void write() {
        System.out.println("Writing with fountain pen...");
    }

    public void rifil(String color) {
        System.out.println("fountain pen color is " + color);
    }

    public void changeNib() {
        System.out.println("Changing nib...");
    }
}

class Monkey {
    void jump() {
        System.out.println("Monkey is jumping");
    }

    void bite() {
        System.out.println("Monkey can bite");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    public void eat() {
        System.out.println("Eating chicken...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }
}

abstract class Phone {
    abstract void ring();

    abstract void player();
}

class SmartPhone extends Phone {
    public void ring() {
        System.out.println("Ringing...");
    }

    public void player() {
        System.out.println("Media player is running in background");
    }

}

interface TvRemote {
    void bottons();

    void sensor();
}

interface SmartTvRemote extends TvRemote {
    void voiceSearch();

    void switches();
}

class Tv implements SmartTvRemote {
    public void bottons() {
        System.out.println("Bottons are not used here");
    }

    public void sensor() {
        System.out.println("Sony sensor associated");
    }

    public void voiceSearch() {
        System.out.println("Say what you wanted to be searched");
    }

    public void switches() {
        System.out.println("There are 5 switches is smart TV");
    }
}

public class Practice15 {
    public static void main(String[] args) {

        Monkey mk = new Human();
        mk.bite();
        mk.jump();
        // mk.eat();-->Dynamic method dispatch
        Tv tv = new Tv();
        tv.bottons();
        tv.sensor();
        tv.voiceSearch();
        tv.switches();
    }
}
