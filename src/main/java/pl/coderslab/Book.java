package pl.coderslab;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import static javax.persistence.GenerationType.*;

@Entity
@Table(name = "books")
@Getter
@Setter
@ToString(exclude = "id")
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @NotEmpty(message = "Invalid ISBN number.")
    private String isbn;
    @Size(min = 2, message = "Title must be longer.")
    private String title;
    @Size(min = 2, message = "Author's name should be longer.")
    private String author;
    @Size(min = 4, message = "Publisher's name should be longer.")
    private String publisher;
    @Size(min = 2, message = "Type is too short.")
    private String type;

}
