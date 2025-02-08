import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.Map;

public class ListOfBooks {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<Book>();

        books.add(new Book("1984", "George Orwell", "Fiction", 9.99, 4.8));
        books.add(new Book("Brave New World", "Aldous Huxley", "Fiction", 12.99, 4.5));
        books.add(new Book("Sapiens", "Yuval Noah Harari", "Non-Fiction", 15.49, 4.7));
        books.add(new Book("Dune", "Frank Herbert", "Sci-Fi", 14.99, 4.6));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", 10.99, 4.9));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", 8.99, 4.9));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", "Fiction", 7.99, 4.2));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 11.49, 4.4));
        books.add(new Book("The Art of War", "Sun Tzu", "Non-Fiction", 6.99, 4.3));
        books.add(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy", 13.99, 4.8));

        System.out.println("For price");
        List<Book> sorted0= books.stream().filter(price -> (10.0 < price.getPrice())==true).collect(Collectors.toList());
        System.out.println(sorted0);
        System.out.println();

        System.out.println("sorted");
        List<Book> sorted =  books.stream().sorted(Comparator.comparing(Book::getPrice)).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(sorted);

        System.out.println("For rating");
        List<Book> sorted2 =  books.stream().max(Comparator.comparing(Book::getRating)).stream().collect(Collectors.toList());
        System.out.println(sorted2);
        System.out.println();

        System.out.println("For genre");
        List<Book> sorted3 = books.stream().sorted(Comparator.comparing(Book::getGenre)).collect(Collectors.toList());
        System.out.println(sorted3);
    }
}
