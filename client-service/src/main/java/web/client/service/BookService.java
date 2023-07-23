package web.client.service;

import web.client.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooksByFeign();
}
