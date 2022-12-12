package HomeworkBean1;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Author author(){
        Author author = new Author("Jack London");
        return author;
    }

    @Bean
    public Book book(Author author){
        Book book = new Book();
        book.setName("Sea Wolf");
        book.setAuthor(author);
        return book;
    }

    @Bean
    public Reader reader(Book book){
        Reader reader = new Reader();
        reader.setName("Ivan Ivanov");
        reader.setBook(book);
        return reader;
    }


}
