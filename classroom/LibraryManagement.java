/**
 * ==========================================================
 * Program Name: LibraryManagement
 * Description : Inheritance and Array List
 * Author      : Nihal Kumar
 * Created On  : 08-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

import java.util.*;

abstract class LibraryItem {
    int id;
    Strings title;
    Strings author;
    int publicationYear;
    boolean available;

    LibraryItem(int id, Strings title, Strings author, int publicationYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.available = true;
    }

    void checkOut() {
        if (available) {
            available = false;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void returnItem() {
        available = true;
        System.out.println(title + " has been returned.");
    }

    boolean isAvailable() {
        return available;
    }

    abstract Strings getDetails();
}

class Book extends LibraryItem {
    Strings ISBN;
    Strings genre;
    int pages;

    Book(int id, Strings title, Strings author, int publicationYear, Strings ISBN, Strings genre, int pages) {
        super(id, title, author, publicationYear);
        this.ISBN = ISBN;
        this.genre = genre;
        this.pages = pages;
    }

    Strings getGenre() {
        return genre;
    }

    int getPageCount() {
        return pages;
    }

    @Override
    Strings getDetails() {
        return "Book: " + title + " by " + author + ", Genre: " + genre + ", Pages: " + pages;
    }
}

class Journal extends LibraryItem {
    Strings ISSN;
    int volume;
    int issueNumber;

    Journal(int id, Strings title, Strings author, int publicationYear, Strings ISSN, int volume, int issueNumber) {
        super(id, title, author, publicationYear);
        this.ISSN = ISSN;
        this.volume = volume;
        this.issueNumber = issueNumber;
    }

    int getVolume() {
        return volume;
    }

    int getIssueNumber() {
        return issueNumber;
    }

    @Override
    Strings getDetails() {
        return "Journal: " + title + " (Volume: " + volume + ", Issue: " + issueNumber + ")";
    }
}

class DVD extends LibraryItem {
    int duration;
    Strings format;
    Strings regionCode;

    DVD(int id, Strings title, Strings author, int publicationYear, int duration, Strings format, Strings regionCode) {
        super(id, title, author, publicationYear);
        this.duration = duration;
        this.format = format;
        this.regionCode = regionCode;
    }

    int getDuration() {
        return duration;
    }

    Strings getFormat() {
        return format;
    }

    @Override
    Strings getDetails() {
        return "DVD: " + title + " (Duration: " + duration + " mins, Format: " + format + ")";
    }
}

class Library {
    List<LibraryItem> items = new ArrayList<>();

    void addItem(LibraryItem item) {
        items.add(item);
        System.out.println(item.title + " added to the library.");
    }

    boolean removeItem(int id) {
        for (LibraryItem item : items) {
            if (item.id == id) {
                items.remove(item);
                System.out.println(item.title + " removed from the library.");
                return true;
            }
        }
        return false;
    }

    LibraryItem searchItem(Strings title) {
        for (LibraryItem item : items) {
            if (item.title.equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }

    void displayAllItems() {
        for (LibraryItem item : items) {
            System.out.println(item.getDetails() + " | Available: " + item.isAvailable());
        }
    }
}

public class LibraryManagement {
    public static void main(Strings[] args) {
        Library library = new Library();
        
        Book book1 = new Book(1, "Bhagavad Gita", "Vyasa", 400, "978-81-7992-604-7", "Spirituality", 700);
        Book book2 = new Book(2, "Mahabharata", "Vyasa", 300, "978-93-5177-842-7", "Epic", 2000);
        
        Journal journal1 = new Journal(3, "Indian Historical Review", "IHR Editors", 2023, "1234-5678", 45, 3);
        
        DVD dvd1 = new DVD(4, "Ramayana: Animated Series", "Valmiki", 2021, 120, "Blu-ray", "Region 5");
        
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(journal1);
        library.addItem(dvd1);
        
        System.out.println("\nLibrary Collection:");
        library.displayAllItems();
        
        System.out.println("\nChecking out 'Bhagavad Gita'...");
        book1.checkOut();
        library.displayAllItems();
        
        System.out.println("\nReturning 'Bhagavad Gita'...");
        book1.returnItem();
        library.displayAllItems();
    }
}

