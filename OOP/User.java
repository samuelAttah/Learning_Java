package OOP;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    public String name;
    public LocalDate birthDay;
    public ArrayList<Book> borrowedBooks = new ArrayList<Book>();

    public void borrow(Book book) {
        this.borrowedBooks.add(book);
    }

    public int age() {
        int age = Period.between(this.birthDay, LocalDate.now()).getYears();

        return age;
    }

}
