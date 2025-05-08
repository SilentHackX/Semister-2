import java.util.ArrayList;
import java.util.List;

// Book class (parent class)
class Book {
    protected String name;
    protected int isbn;
    protected String author;

    public Book(String name, int isbn, String author) {
        this.name = name;
        this.isbn = isbn;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book Name: " + name + ", ISBN: " + isbn + ", Author: " + author;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

// Audio interface
interface Audio {
    int getDuration();
    String getNarrator();
    void displayAudioInfo();
}

// AudioBook class (extends Book and implements Audio)
class AudioBook extends Book implements Audio {
    private int duration; // in minutes
    private String narrator;
    private double filesize; // in MB
    private Library lib; // Association with Library

    public AudioBook(String name, int isbn, String author, int duration, 
                    String narrator, double filesize, Library lib) {
        super(name, isbn, author);
        this.duration = duration;
        this.narrator = narrator;
        this.filesize = filesize;
        this.lib = lib;
    }

    // Implement Audio interface methods
    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public String getNarrator() {
        return narrator;
    }

    @Override
    public void displayAudioInfo() {
        System.out.println("Duration: " + duration + " minutes, Narrator: " + narrator);
    }

    // Additional method to display all details
    public void displayAudioBookDetails() {
        System.out.println(super.toString());
        displayAudioInfo();
        System.out.println("File Size: " + filesize + " MB");
        System.out.println("Library: " + (lib != null ? lib.getName() : "Not assigned"));
    }

    // Getters and setters
    public double getFilesize() {
        return filesize;
    }

    public void setFilesize(double filesize) {
        this.filesize = filesize;
    }

    public Library getLib() {
        return lib;
    }

    public void setLib(Library lib) {
        this.lib = lib;
    }
}

// Library class
class Library {
    private String name;
    private List<AudioBook> audioBooks;

    public Library(String name) {
        this.name = name;
        this.audioBooks = new ArrayList<>();
    }

    public void addAudioBook(AudioBook ab) {
        audioBooks.add(ab);
        ab.setLib(this); // Set the library reference in the AudioBook
    }

    public void displayLibrary() {
        System.out.println("Library Name: " + name);
        System.out.println("Available Audio Books:");
        for (AudioBook ab : audioBooks) {
            ab.displayAudioBookDetails();
            System.out.println("----------------------");
        }
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AudioBook> getAudioBooks() {
        return audioBooks;
    }
    
    
    
    public class TestProgram {
    public static void main(String[] args) {
        // Create a library
        Library centralLibrary = new Library("Central Public Library");
        
        // Create audio books
        AudioBook ab1 = new AudioBook("The Great Gatsby", 123456, "F. Scott Fitzgerald", 
                                    320, "John Smith", 256.5, centralLibrary);
        
        AudioBook ab2 = new AudioBook("To Kill a Mockingbird", 789012, "Harper Lee", 
                                    420, "Emily Johnson", 320.0, centralLibrary);
        
        // Add audio books to the library
        centralLibrary.addAudioBook(ab1);
        centralLibrary.addAudioBook(ab2);
        
        // Display library information
        centralLibrary.displayLibrary();
        
        // Test individual audio book display
        System.out.println("\nTesting individual AudioBook display:");
        ab1.displayAudioBookDetails();
    }
}
}