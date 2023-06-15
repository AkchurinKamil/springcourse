package com.akchurin.springcourse.service;

import com.akchurin.springcourse.dao.UserDAO;
import com.akchurin.springcourse.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;
    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllUser() {
        return userDAO.getAllUser();
    }

    @Override
    @Transactional
    public void addUsers(User user) {
        userDAO.addUsers(user);
    }

    @Override
    public User userById(Long id) {
        return userDAO.userById(id);
    }

    @Override
    @Transactional
    public User update(User user) {
       return userDAO.update(user);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userDAO.delete(id);
    }
}
