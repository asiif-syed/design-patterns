package PrototypeRegistry.BookPrototype;

public class Client {
    public static void main(String[] args){
        Book originalBook = new Book("Effective Java", new Author("Joshua Bloch"));
        Book clonedBook = originalBook.clone();
        clonedBook.setTitle("Cloned book");
        clonedBook.setAuthor(new Author("Tamata"));

        System.out.println(originalBook.getTitle());
        System.out.println(originalBook.getAuthor());

        System.out.println(clonedBook.getTitle());
        System.out.println(clonedBook.getAuthor());
    }
}
