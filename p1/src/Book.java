import java.lang.*;
public class Book {
    private String name;
    private int numbPages;
    public Book(String n, int a){
        name = n;
        numbPages = a;
    }
    public Book(String n){
        name = n;
        numbPages = 0;
    }
    public Book(){
        name = "Nameless";
        numbPages = 0;
    }
    public void setnumbPages(int numbPages) {
        this.numbPages = numbPages;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getnumbPages() {
        return numbPages;
    }
    public String toString(){
        return this.name+", pages "+this.numbPages;
    }
}
