import java.util.List;
import java.util.ArrayList;

public class Book {
    
    private String title;

    public List<Author> authors = new ArrayList<Author>();

    public Book(String title, List<Author> authors) {
        this.title = title;
        this.authors = authors;

    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
