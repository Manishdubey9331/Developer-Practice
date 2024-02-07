/*Create a class Book with attributes title, author, and pages.
 Implement a parameterized constructor and a method to display information
  about the book. Use the this keyword to differentiate between 
  instance variables and parameters.

17. Overload the constructor of the Book class to provide default 
values for the attributes. Create two different objects using 
both constructors and display their information. */


public class Book {
    String title;
    String author;
    int pages;
    Book(String title,String author, int pages)
    {
        this.title=title;
        this.author=author;
        this.pages=pages;
    }
    Book()
    {
        title="Physics";
        author="H.C.Verma";
        pages=550;
    }

    void Bookinfo()
    {
        System.out.println("title of the book is"+" "+this.title);
        System.out.println("author of the book is "+" "+this.author);
        System.out.println("number of the pages are"+" "+this.pages);

    }
    public static void main(String[] args) {
        Book b=new Book("Radiant Reader","Manish Dubey",780);
        b.Bookinfo();
        Book b1= new Book();
        b1.Bookinfo();
}}
