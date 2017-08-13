package by.intexsoft.SHJ2.dao;

import by.intexsoft.SHJ2.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void edit(User user);
    void delete(int userId);
    User getUser(int userId);
    List getAllUsers();
}
