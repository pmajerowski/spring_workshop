package pl.coderslab;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Component
public class MockBookService {
    private final List<Book> list;
    private static Long nextId;

    public MockBookService() {
        list = new ArrayList<>();
        list.add(new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel", "Helion", "programming"));
        list.add(new Book(2L, "911101561659", "Rusz głową Java.", "Sierra Kathy, Bates Bert", "Helion",
                "programming"));
        list.add(new Book(3L, "11068081565", "Java 2. Podstawy", "Cay Horstmann, Gary Cornell", "Helion",
                "programming"));
        list.add(new Book(4L, "4534545819338", "Harry Potter", "J. K. Rowling", "Gryffindor",
                "fantasy"));

        nextId = list.stream().map(Book::getId).max(Comparator.naturalOrder()).get();
    }

    public List<Book> getAllBooks() {
        return list;
    }

    public Book getBook(Long book_id) {
        return list.stream()
                .filter(b -> b.getId() == book_id)
                .findFirst()
                .get();
    }

    public void addBook(Book book) {
        nextId += 1;
        book.setId(nextId);
        list.add(book);
    }

    public void editBook(Book book) {
        int index = list.indexOf(getBook(book.getId()));
        list.set(index, book);

    }

    public void deleteBook(long book_id) {
        list.remove(getBook(book_id));
    }

}
