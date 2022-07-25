package array;
import java.util.Scanner;
class Book {
    private int id;
    private String bookName;
    private String authorName;

    public Book(int id, String bookName, String authorName) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public void display() {
        System.out.println("Book Id: " + this.id + " Book Name: " + this.bookName + " Author Name: " + this.authorName);
    }
}
public class ArrayOfObjects {
    public static void main(String[] args) {
        Book book[]=new Book[2];
        /*book[0]=new Book(101,"Galpa 101","Satyajit Ray");
        book[0].display();
        book[1]=new Book(102,"Bomkesh Samagra","Sharadindu Bandyapadhay");
        book[1].display();*/
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<book.length;i++) {
        System.out.println("Enter ID:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Book Name: ");
        String bookName = sc.nextLine();
        System.out.println("Enter Author Name: ");
        String authorName = sc.nextLine();
        book[i] = new Book(id, bookName,authorName);
    }
        System.out.println("Book details-------");
    for(int i=0;i<book.length;i++){
        book[i].display();
    }
    }
}
