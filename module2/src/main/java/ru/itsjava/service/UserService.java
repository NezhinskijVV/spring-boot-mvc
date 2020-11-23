package ru.itsjava.service;

import ru.itsjava.domain.User;

public interface UserService {
    User findById(long id);
}
