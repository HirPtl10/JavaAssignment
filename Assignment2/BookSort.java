import java.util.*;

class Book implements Comparable<Book> {
    String title;
    double price;
    int year;

    Book(String t, double p, int y) {
        title = t;
        price = p;
        year = y;
    }

    public int compareTo(Book b) {
        return this.title.compareTo(b.title);
    }

    public String toString() {
        return title + "($" + price + "," + year + ")";
    }
}

public class BookSort {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>(Arrays.asList(
            new Book("Java", 450, 2020),
            new Book("Python", 350, 2019),
            new Book("C++", 500, 2018)));
        Collections.sort(books);
        System.out.println("By Title: " + books);
        books.sort(Comparator.comparingDouble(b -> b.price));
        System.out.println("By Price: " + books);
        books.sort(Comparator.comparingInt((Book b) -> b.year).reversed());
        System.out.println("By Year(desc): " + books);
    }
}
