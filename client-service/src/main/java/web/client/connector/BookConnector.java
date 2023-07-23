package web.client.connector;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import web.client.config.FeignConfig;
import web.client.model.Book;

import java.util.List;

@FeignClient(
        name = "book-service",
        url = "${book-service.url}",
        configuration = FeignConfig.class
)
public interface BookConnector {
    @GetMapping("/api/books")
    List<Book> getAllBooks();
}
