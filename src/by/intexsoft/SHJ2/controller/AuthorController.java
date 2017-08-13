package by.intexsoft.SHJ2.controller;

import by.intexsoft.SHJ2.model.Author;
import by.intexsoft.SHJ2.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @RequestMapping(path = "/all")
    public ResponseEntity<?> getAll() {
        List<Author> users = authorService.findAll();
        return new ResponseEntity<List<Author>>(users, HttpStatus.OK);
    }

    @RequestMapping(path = "/new", method = RequestMethod.POST)
    public ResponseEntity<?> createNewUser() {
        String date = new Date().toString();
        Author author = new Author();
        author.name = "Name";
        author.info = "Info";
        author = authorService.save(author);
        return new ResponseEntity<Author>(author, HttpStatus.OK);
    }
}
