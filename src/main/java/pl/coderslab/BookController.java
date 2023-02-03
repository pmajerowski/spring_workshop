package pl.coderslab;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private MockBookService mockBookService;

    public BookController(MockBookService mockBookService) {
        this.mockBookService = mockBookService;
    }

    @RequestMapping("/helloBook")
    public Book helloBook() {
        return new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel", "Helion", "programming");
    }



    @RequestMapping
    public List<Book> allBooks() {
        return mockBookService.getAllBooks();
    }

    @RequestMapping("/{id}")
    public Book getBook(@PathVariable Long id) {
        return mockBookService.getBook(id);
    }

}
