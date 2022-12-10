package com.example.demo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection  = "Book")
public class Book {


        @Id private int id;
        private String bookName;
        private String authorName;


        @DocumentReference(lookup = "{'author':?#{#self._id} }")
        Author author;




}
