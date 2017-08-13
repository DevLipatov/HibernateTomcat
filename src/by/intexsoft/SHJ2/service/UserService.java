package by.intexsoft.SHJ2.service;

import by.intexsoft.SHJ2.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void edit(User user);
    void delete(int userId);
    User getUser(int userId);
    List getAllUsers();
}
