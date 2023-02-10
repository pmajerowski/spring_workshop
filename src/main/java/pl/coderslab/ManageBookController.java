package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/books")
public class ManageBookController {

    private final JpaBookService jpaBookService;

    public ManageBookController(JpaBookService bookService) {
        this.jpaBookService = bookService;
    }

    // -> lista wszystkich książek (widok done)
    @GetMapping("/all")
    public String showPosts(Model model) {
        List<Book> books = jpaBookService.getAllBooks();
        model.addAttribute("books", books);
        return "/books/list";
    }

    // -> widok jednej książki po id (widok done)
    @GetMapping("/{id}")
    public String showBookById(@PathVariable Long id, Model model) {
        Book book = jpaBookService.getBook(id);
        model.addAttribute("book", book);
        return "/books/get";
    }

    // -> formularz dodawania nowej książki (widok done)
    @GetMapping("/new")
    public String newBook(Model model) {
        Book book = new Book();
        model.addAttribute("book", book);
        return "/books/new";
    }

    // -> zapis nowo dodanej książki do bazy danych (zapisuje)
    @PostMapping("/save")
    public String saveBook(@Valid Book book, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/books/new";
        }
        jpaBookService.addBook(book);
        return "redirect:/books/all";
    }

    // -> formularz edycji książki (widok done)
    @GetMapping("/edit/{id}")
    public String editBook(@PathVariable Long id, Model model) {
        Book book = jpaBookService.getBook(id);
        model.addAttribute("book", book);
        return "/books/edit";
    }

    // -> zapis edytowanej książki (zapisuje)
    @PostMapping("/edit/save")
    public String editBook(@Valid Book book, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("book", book);
            return "/books/edit";
        }
//        book.setId(id);
        jpaBookService.addBook(book);
        return "redirect:/books/all";
    }

    // -> potwierdzenie usunięcia książki (przekierowuje)
    @GetMapping("/confirm/{id}")
    public String deleteConfirm(@PathVariable Long id, Model model) {
        model.addAttribute("id", id);
        return "/books/deleteConfirm";
    }

    // -> usunięcie książki (usuwa)
    @RequestMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        jpaBookService.deleteBook(id);
        return "redirect:/books/all";
    }

}
