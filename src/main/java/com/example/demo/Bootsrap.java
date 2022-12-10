package com.example.demo;

import com.example.demo.Repository.BookRepository;
import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootsrap implements CommandLineRunner {

    @Autowired
    BookRepository bookRepository;
    @Override
    public void run(String... args) throws Exception {

     //  bookRepository.save(new Book(1L,"mohamed",100));

    }
}
