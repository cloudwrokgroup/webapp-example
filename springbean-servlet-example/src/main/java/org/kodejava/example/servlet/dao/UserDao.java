package org.kodejava.example.servlet.dao;

import org.kodejava.example.servlet.model.User;

public interface UserDao {
    User getUser(Long userId);
}
