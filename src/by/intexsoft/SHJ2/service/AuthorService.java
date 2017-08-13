package by.intexsoft.SHJ2.service;

import by.intexsoft.SHJ2.model.Author;

public interface AuthorService extends AbstractEntityService<Author> {
    Author findByName(String name);
}