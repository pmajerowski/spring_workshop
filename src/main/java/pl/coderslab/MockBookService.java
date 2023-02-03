package pl.coderslab;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MockBookService {
    private List<Book> list;

    public List<Book> getAllBooks() {
        return list;
    }

    public Book getBook(Long book_id) {
         return list.stream()
                .filter(b -> b.getId() == book_id)
                .findFirst()
                 .get();
    }


}
