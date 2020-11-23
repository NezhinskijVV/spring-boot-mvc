package ru.itsjava.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.itsjava.domain.User;
import ru.itsjava.repository.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public User findById(long id) {
        return repository.getById(id).get();
    }

    @Override
    public List<User> findAll() {
        return repository.getAll();
    }

    @Transactional
    @Override
    public void save(User user) {
        repository.updateUser(user);
    }
}