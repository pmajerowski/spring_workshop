package pl.coderslab;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BookConverter implements Converter<String, Book> {
    private final BookRepository bookRepository;

    public BookConverter(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book convert(String source) {
        return bookRepository.findById(Long.parseLong(source)).get();
    }
}