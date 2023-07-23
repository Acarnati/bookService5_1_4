package web.book.service;

import web.book.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAllBooks();
}
