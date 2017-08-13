package by.intexsoft.SHJ2.dao.impl;

import by.intexsoft.SHJ2.dao.UserDao;
import by.intexsoft.SHJ2.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void edit(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    @Override
    public void delete(int userId) {
        sessionFactory.getCurrentSession().delete(getUser(userId));
    }

    @Override
    public User getUser(int userId) {
        return sessionFactory.getCurrentSession().get(User.class, userId);
    }

    @Override
    public List getAllUsers() {
        return sessionFactory.getCurrentSession().createQuery("FROM users").list();
    }
}
