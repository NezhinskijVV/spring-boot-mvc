package ru.itsjava.service;

import ru.itsjava.domain.User;

import java.util.List;

public interface UserService {
    User findById(long id);
    List<User> findAll();
    void save(User user);
}
