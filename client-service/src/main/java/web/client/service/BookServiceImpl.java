package web.client.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import web.client.connector.BookConnector;
import web.client.model.Book;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Value("${book-service.url}")
    private String bookServiceUrl;

    private final BookConnector bookConnector;

    public BookServiceImpl(BookConnector bookConnector) {
        this.bookConnector = bookConnector;
    }

    @Override
    public List<Book> getAllBooksByFeign() {
        return bookConnector.getAllBooks();
    }
}
