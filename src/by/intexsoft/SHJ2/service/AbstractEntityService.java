package by.intexsoft.SHJ2.service;

import by.intexsoft.SHJ2.model.AbstractEntity;

import java.util.List;

public interface AbstractEntityService<T extends AbstractEntity> {
    void delete(int id);

    T save(T entity);

    T find(int id);

    List<T> findAll();
}
