package PrototypeRegistry.BookPrototype;

import PrototypeRegistry.Prototype;

public class Book implements Prototype {
    private String title;
    private Author author;

    public Book(String title, Author author){
        this.title = title;
        this.author = author;
    }

//    Copy constructor for deep copying Author
    private Book(Book book){
        this.title = book.title;
        this.author = new Author(book.author.getName());
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(Author author){
        this.author = author;
    }
    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
       return this.author.getName();
    }
    @Override
    public Book clone() {
        return new Book(this);
    }

}
