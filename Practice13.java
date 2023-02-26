import java.util.Scanner;

class Library{
    int size = 10;
    String[] ar= new String[20];
    void showAvalableBook(){
        
        String ar[] = {"Mia Khalifa books","Dani Daniels books","Desi books","Mia Malkova books","Desi Bhabi books","Angela White books","Meeti kalher books","Sunny Leone books","Jia Lissa books","Sabita Bhabi books"};
        System.out.println("Avalable books are:");
        for (int i = 0; i < 11; i++) {
            System.out.println(ar[i]);
        }
    }
    void addBook(){
        System.out.println("Welcome to National Library!");
        System.out.println("Enter book name which you want to be added");
        Scanner sc = new Scanner(System.in);
        String bookname = sc.nextLine();
        this.size+=1;
        this.ar[11]=bookname;
    }
    void issueBook(){
        
    }
    void returnBook(){

    }
}

public class Practice13 {
    public static void main(String[] args) {
        Library lr =new Library();
        lr.addBook();
        lr.showAvalableBook();
    }
}
