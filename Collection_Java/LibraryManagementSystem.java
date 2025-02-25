package Collection_Java;

import java.util.ArrayList;

class Book{
    String title;
    String author;
    String ISBN;
    Boolean isAvailable;
    public Book() {};
    public Book(String title, String author, String iSBN, Boolean isAvailable) {
        this.title = title;
        this.author = author;
        ISBN = iSBN;
        this.isAvailable = isAvailable;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public Boolean getIsAvailable() {
        return isAvailable;
    }
    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    @Override
    public String toString(){
        return "Book {"+ " Title = "+title+" , "+" Author = "+ author+" , "+" ISBN= "+ ISBN +" , "+" Available = "+isAvailable+"}";
    }
}

class Library{
    ArrayList <Book> books;
    Library(){
        books = new ArrayList<>();
    }
    public void addBook(Book b){
        books.add(b);
        System.out.println("Books Added : "+ b.getTitle());
    };

    public void displayBooks(){
        for (Book book : books) {
            if (book.isAvailable) {
                System.out.println(book); 
            }
            
        }
    }
    public void searchbook(String name){
        System.out.println("\nBook Written by Author "+ name+"\n");
        for (Book book : books) {
            if(book.getAuthor().equalsIgnoreCase(name)){
                System.out.println(book);

            }
        }
    }

    public void removeBook(String ISBN){
        int before = books.size();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).ISBN.equalsIgnoreCase(ISBN)) {

                books.remove(i);   
            } 
        }
        if (before==books.size()) {
            System.out.println("!!!! Invalid ISBN number !!!!");

        }
        // another alternative
        // books.removeIf(n-> n.getISBN().equalsIgnoreCase(ISBN));
    }

    public void updatestatus(){
        for (Book book : books) {
            if (book.isAvailable==false) {
                book.isAvailable=true;
                
            }  
        }
    }

}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        System.out.println("-------------Welcome to Library Management System --------------");
        Library user = new Library();
        Book Book1 = new Book("LetUS C", "Restin beiber", "ASH654", false);
        Book Book2 = new Book("Java Programming Part 1 ", "John Doe", "ASG654", true);
        Book Book3 = new Book("Java Programming Part 2", "John Singh", "ASY954", false);
        user.addBook(Book1);
        user.addBook(Book2);
        user.addBook(Book3);
        user.displayBooks();
        user.searchbook("John Doe");
        // System.out.println("Removing book having ISBN ");
        // user.removeBook("ASH654");
        user.displayBooks();
        System.out.println("Book Status Changed \n All Books are available now");
        user.updatestatus();
        user.displayBooks();
    }

    
}
