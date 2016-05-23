package com.fortherosesocial.assembler;

import com.fortherosesocial.model.Author;
import com.fortherosesocial.resources.AuthorResource;
import ma.glasnost.orika.MapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityLinks;
import org.springframework.hateoas.ResourceAssembler;

public class AuthorAssembler implements ResourceAssembler<Author, AuthorResource>{

    @Autowired
    private EntityLinks entityLinks;

    @Autowired
    MapperFactory mapperFactory;

    @Override
    public AuthorResource toResource(Author author) {
        mapperFactory.classMap(AuthorResource.class, Author.class).byDefault().register();
        AuthorResource authorResource = mapperFactory.getMapperFacade().map(author, AuthorResource.class);
        authorResource.add(entityLinks.linkToSingleResource(Author.class,
                author.getId()));
        return authorResource;
    }
}
