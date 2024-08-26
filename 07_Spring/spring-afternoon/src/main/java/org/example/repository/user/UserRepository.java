package org.example.repository.user;

import lombok.RequiredArgsConstructor;
import org.example.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@Transactional
@RequiredArgsConstructor
public class UserRepository {
    private final EntityManager em;

    public User findByUserName(String username) {
        String jpql = "select u from User u where u.username = :username";

        List<User> users = em.createQuery(jpql, User.class)
                .setParameter("username", username)
                .getResultList();

        return users.isEmpty() ? null : users.get(0);
    }

    public User save(User user) {
        em.persist(user);
        return user;
    }
}