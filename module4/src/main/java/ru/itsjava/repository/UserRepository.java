package ru.itsjava.repository;

import ru.itsjava.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    Optional<User> getById(long id);

    List<User> getAll();

    User save(User user);

    void updateUser(User user);
}
