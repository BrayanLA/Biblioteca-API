package com.library.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.library.library.model.Book;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    
    List<Book> findBookById(@Param("id") Integer id);

}
