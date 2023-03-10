package com.example.demo;

import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    private static final Logger logger = LoggerFactory.getLogger(BookRepository.class);

    private final AuthorRepository authorRepository;

    private final List<Book> books = new ArrayList<>();

    public BookRepository(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Book> findAll() {
        logger.info("findAll - start ");
        long start = System.currentTimeMillis();
        logger.info("findAll - end - took [{}] ms", System.currentTimeMillis() - start);
        return books;
    }

    public Book findOne(Integer id) {
        return books.stream()
                .filter(book -> Objects.equals(book.id(), id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Book not found"));
    }

    @PostConstruct
    private void init() {
        books.add(new Book(1, "Reactive Spring", 484, Rating.FIVE_STARS, authorRepository.findByName("Josh Long")));
        books.add(new Book(
                2, "Spring Boot Up & Running", 328, Rating.TWO_STARS, authorRepository.findByName("Mark Heckler")));
        books.add(new Book(
                3,
                "Hacking with Spring Boot 2.3",
                392,
                Rating.THREE_STARS,
                authorRepository.findByName("Greg Turnquist")));
    }
}
