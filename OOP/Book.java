package OOP;

public class Book {
    public String title;
    public String author;

    // IMPLEMENTING A TO STRING METHOD FOR BOOK CLASS
    public String toString() {
        return String.format("%s by %s ", this.title, this.author);
    }

}
