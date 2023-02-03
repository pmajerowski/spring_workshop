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

    @RequestMapping("")
    public List<Book> allBooks() {
        return mockBookService.getAllBooks();
    }

    @RequestMapping("/{id}")
    public Book getBook(@PathVariable Long id) {
        return mockBookService.getBook(id);
    }

    @PostMapping("")
    public void addBook(@RequestBody Book book) {
        mockBookService.addBook(book);
    }

    @PutMapping("")
    public void editBook(@RequestBody Book book) {
        mockBookService.editBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable long id) {
        mockBookService.deleteBook(id);
    }

}

/*
    curl -X POST -i -H "Content-Type: application/json" -d '{"isbn":"1100294652","title":"The Road", "publisher":"Reading World","type":"science fiction", "author":"Cormac McCarthy"}' http://localhost:8080/books
    curl -X DELETE -i  http://localhost:8080/books/2
    curl -X PUT -i -H "Content-Type: application/json" -d '{"id":3,"isbn":"1122233","title":"Old Man And The Sea",  "publisher":"World Industries","type":"novel", "author":"Ernest Hemingway"}' http://localhost:8080/books
 */
