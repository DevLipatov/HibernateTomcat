package by.intexsoft.SHJ2.repository;

import by.intexsoft.SHJ2.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface AuthorRepository extends JpaRepository<Author, Integer> {
    Author findByName(String authorName);
}
