package web.book.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import web.book.model.Book;

public interface BookRepository extends MongoRepository<Book, String> {
}
