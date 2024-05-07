package oopsExcercises;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int ISBN;

    private static ArrayList<Book> booksCollection =  new ArrayList<>();

    public Book(String title, String author, int ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getISBN(){
        return ISBN;
    }

    public static void addBook(Book book){
        booksCollection.add(book);
    }
    public static void removeBook(Book book){
        booksCollection.remove(book);
    }
    public static ArrayList<Book> getBooksCollection(){
        return booksCollection;
    }

    public static void main(String [] Args){
        Book newbook = new Book("harry potter1","JK rowling",1234);
        Book.addBook(newbook);
        for(Book book: booksCollection){
            System.out.println(newbook.getTitle() + " " + newbook.getAuthor() + " " + newbook.getISBN());
        }
    }

}
