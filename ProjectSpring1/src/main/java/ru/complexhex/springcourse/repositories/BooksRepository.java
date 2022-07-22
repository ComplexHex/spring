package ru.complexhex.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.complexhex.springcourse.models.Book;

import java.util.List;

public interface BooksRepository extends JpaRepository<Book, Integer> {
    List<Book> findByTitleStartingWith(String title);
}
