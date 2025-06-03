package Library;

public class LibraryBook {
    static int counter = 0;
    private int id;
    private String title, author;

    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
        counter++;
        id = counter;
    }

    public LibraryBook() {
        counter++;
        id = counter;
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

    @Override
    public String toString() {
        return "ID: " + id +"\tTitle: " + title + "\tAuthor: " + author;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof LibraryBook)) return false;
        LibraryBook o = (LibraryBook)obj;
        return (this.title.compareTo(o.title) == 0) && (this.author.compareTo(o.author) == 0);
    }

    public void borrow() {
        System.out.println("You have borrowed: " + this.toString());
    }

    public void returnBook() {
        System.out.println("You have returned: " + this.toString());
    }

    public static int getNumBooks() {
        return counter;
    }
}