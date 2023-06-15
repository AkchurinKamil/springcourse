package com.akchurin.springcourse.dao;

import com.akchurin.springcourse.entity.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUser();
    public void addUsers(User user);

    public User userById(Long id);

    public User update(User user);

    public void delete(Long id);


}
