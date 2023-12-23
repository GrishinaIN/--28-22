import java.lang.*;
public class BookTester {
    public static void main(String[] args) {
        Book b1 = new Book("Parallel world", 435);
        Book b2 = new Book("Dark forest");
        Book b3 = new Book();
        b2.setnumbPages(148);
        b3.setName("New world");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}