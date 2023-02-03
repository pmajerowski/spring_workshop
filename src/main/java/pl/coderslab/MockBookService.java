package pl.coderslab;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MockBookService {
    private List<Book> list;

    public MockBookService() {
        list = new ArrayList<>();
        list.add(new Book(1L, "9788324631766", "Thinking in	Java", "Bruce	Eckel", "Helion", "programming"));
        list.add(new Book(2L, "911101561659", "Rusz	głową	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",
                "programming"));
        list.add(new Book(3L, "11068081565", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
                "programming"));
        list.add(new Book(4L, "4534545819338", "Harry Potter", "J. K. Rowling", "Gryffindor",
                "fantasy"));
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
        Long nextId = list.get(list.size()-1).getId() + 1;
        book.setId(nextId);
        list.add(book);
    }

    public void editBook(Book book) {
        int index = list.indexOf(getBook(book.getId()));
        list.set(index, book);

    }

    public void deleteBook(int book_id) {
        int index = list.indexOf(getBook((long) book_id));
        list.remove(index);
    }

}
