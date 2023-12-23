import java.lang.*;
public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Ivan Popov", "ivPopov@somewhere.com", 'M');
        System.out.println(author.toString());
    }
}