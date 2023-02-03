package pl.coderslab;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MockBookService {
    private List<Book> list;

    public List<pl.coderslab.Book> get() {
        return list;
    }

    public Book get(Long id) {
         return list.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                 .get();
    }


}
