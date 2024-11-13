import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private String publisher;
    private String genre;
    private int pageCount;

    public Book(String title, String author, int publicationYear, String publisher, String genre, int pageCount) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the book title: ");
        this.title = scanner.nextLine();

        System.out.print("Enter the author's name: ");
        this.author = scanner.nextLine();

        System.out.print("Enter the publication year: ");
        this.publicationYear = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter the publisher: ");
        this.publisher = scanner.nextLine();

        System.out.print("Enter the genre: ");
        this.genre = scanner.nextLine();

        System.out.print("Enter the page count: ");
        this.pageCount = scanner.nextInt();
    }

    public void displayData() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Publication Year: " + this.publicationYear);
        System.out.println("Publisher: " + this.publisher);
        System.out.println("Genre: " + this.genre);
        System.out.println("Page Count: " + this.pageCount);
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

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setBookInfo(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void setBookInfo(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void setBookInfo(String title, String author, int publicationYear, String publisher, String genre, int pageCount) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.genre = genre;
        this.pageCount = pageCount;
    }
}
