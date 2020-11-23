package ru.itsjava.repository;

import org.springframework.stereotype.Repository;
import ru.itsjava.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository{
    @PersistenceContext
    private EntityManager entityManager;

    public Optional<User> getById(long id) {
        return Optional.of(entityManager.find(User.class, id));
    }

    public User save(User user) {
        entityManager.persist(user);
        return user;
    }
}
