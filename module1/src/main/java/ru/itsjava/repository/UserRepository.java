package ru.itsjava.repository;

import ru.itsjava.domain.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> getById(long id);
    User save(User user);
}
