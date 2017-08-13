package by.intexsoft.SHJ2.service.impl;

import by.intexsoft.SHJ2.model.Author;
import by.intexsoft.SHJ2.repository.AuthorRepository;
import by.intexsoft.SHJ2.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorDetailServiceImpl extends AbstractEntityServiceImpl<Author> implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Author findByName(String name) {
        if (name != null) {
            return authorRepository.findByName(name);
        }
        return null;
    }
}
