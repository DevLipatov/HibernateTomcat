package by.intexsoft.SHJ2.service.impl;

import by.intexsoft.SHJ2.dao.UserDao;
import by.intexsoft.SHJ2.model.User;
import by.intexsoft.SHJ2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public void add(User user) {
        userDao.add(user);
    }

    @Transactional
    public void edit(User user) {
        userDao.edit(user);
    }

    @Transactional
    public void delete(int userId) {
        userDao.delete(userId);
    }

    @Transactional
    public User getUser(int userId) {
        return userDao.getUser(userId);
    }

    @Transactional
    public List getAllUsers() {
        return userDao.getAllUsers();
    }
}
