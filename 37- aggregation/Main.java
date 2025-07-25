
public class Main {

    public static void main(String[] args) {

        // Aggregation = Represents a "has-a" relationship between objects.
        //               One object contains another object as part of its structure.
        //               but the contained object/s can exist independently.

        Book book1 = new Book("The Fellow of the Ring", 423);
        Book book2 = new Book("The Two Towers", 352);
        Book book3 = new Book("The Return of the King", 415);

        Book[] books = {book1, book2, book3};

        Library library = new Library("NYC public library", 1983, books);

        library.displayInfo();


    }

}
