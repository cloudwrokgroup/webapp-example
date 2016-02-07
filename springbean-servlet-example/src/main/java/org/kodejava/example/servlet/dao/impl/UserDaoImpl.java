package org.kodejava.example.servlet.dao.impl;

import org.kodejava.example.servlet.dao.UserDao;
import org.kodejava.example.servlet.model.User;

public class UserDaoImpl implements UserDao {
    public User getUser(Long userId) {
        if (userId == 1L) {
            return new User(1L, "wsaryada", "Wayan Saryada");
        }
        return new User();
    }
}
