

class Employee {

    int salary=90000;
    String name;
    void getSalary(){
        System.out.println("Salary is : "+ salary);
    }
    void getName(){
        System.out.println("Employee name is : "+name);
    }
    void setName(String y){
        name=y; 
    }
}

class Square{
    int side;
    Square(int x){
        side=x;
    }
    void area(){
        System.out.println("Area is : "+ (side*side));
    }
    void perimiter(){
        System.out.println("Perimitre is :"+ (4*side));
    }
}

public class practice7 {
    public static void main(String[] args) {
        Employee mukesh = new Employee();
        mukesh.setName("Mukesh");
        mukesh.getName();
        mukesh.getSalary();
        Square ok=new Square(15);
        ok.area();
        ok.perimiter();

    }
}