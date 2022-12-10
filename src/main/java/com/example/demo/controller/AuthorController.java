package com.example.demo.controller;

import com.example.demo.Repository.AuthorRepository;
import com.example.demo.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorRepository repo;

    @PostMapping("/addAuthor")
    public String saveAuthor(@RequestBody Author author){
        repo.save(author);

        return "Added Successfully";
    }

    @GetMapping("/findAllAuthors")
    public List<Author> getAuthors() {

        return repo.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAuthor(@PathVariable int id){
        repo.deleteById(id);

        return "Deleted Successfully";
    }


}
