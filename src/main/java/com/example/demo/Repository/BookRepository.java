package com.example.demo.Repository;

import com.example.demo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface BookRepository extends MongoRepository<Book,Integer> {
}
