package com.example.springbootin10step;

import org.apache.tomcat.util.http.fileupload.util.LimitedInputStream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController{
    @GetMapping("book")
    public List <Book> getAllbook() {
        Book  mybook [] = { new Book(45 , "Java Learning ", " Narayan C Sau "),
                            new Book(75 , "Java Programming ", " Narayan C Saha ") } ;

      //  return Arrays.asList( new Book(45 , "Java Learning ", " Narayan C Sau ") );

        return Arrays.asList( (mybook) );

       // return Arrays.asList( new Book [] {(45 , "Java Learning ", " Narayan C Sau ") } ,
         //                                   {   (45 , "Java Learning ", " Narayan C Sau ")} );
    }
}
