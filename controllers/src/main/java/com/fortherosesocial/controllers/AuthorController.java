package com.fortherosesocial.controllers;

import com.fortherosesocial.assembler.AuthorAssembler;
import com.fortherosesocial.model.Author;
import com.fortherosesocial.resources.AuthorResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorResource authorResource;

    @Autowired
    AuthorAssembler authorAssembler;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<AuthorResource> getAuthorById(@PathVariable("id") long id) {
        Author author = new Author();
        author.setId(1l);
        author.setName("lev");
        AuthorResource resource = authorAssembler.toResource(author);
        return new ResponseEntity(resource, HttpStatus.FOUND);
    }
}
