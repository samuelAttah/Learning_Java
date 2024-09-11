package OOP;

import java.time.LocalDate;

public class General {
    public static void main(String[] args) {
        // INSTANTIATING BOOK OBJECT
        Book book1 = new Book();
        book1.author = "William Shakespeare";
        book1.title = "Hamlet";

        Book book2 = new Book();
        book2.author = "Danielle Steel";
        book2.title = "Kaleidoscope and Sisters";

        // INSTANTIATING USER OBJECT
        User user = new User();
        user.name = "Samuel";
        user.birthDay = LocalDate.parse("1995-03-02");
        System.out.println(user.age());
        System.out.println(user.borrowedBooks);
        user.borrow(book1); // CALLING CLASS METHOD;
        System.out.println(user.borrowedBooks);

        // TRYING STUDENT CLASS WITH A CONSTRUCTOR
        Student student1 = new Student("Samuel", 4.57);
        System.out.println(student1.getStudentDetails());

    }

}
