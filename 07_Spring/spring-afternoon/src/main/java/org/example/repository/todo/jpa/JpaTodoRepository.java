package org.example.repository.todo.jpa;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.domain.todo.Todo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Transactional
@Repository
public class JpaTodoRepository {
    private final EntityManager em;

    public List<Todo> findAll() {
        String jpql = "select t from Todo t";
        List<Todo> todoList = em.createQuery(jpql, Todo.class).getResultList();
        return todoList;
    }

    public Todo findById(Long id) {
        return em.find(Todo.class, id);
    }

    public Todo save(Todo newTodo) {
        em.persist(newTodo);
        return newTodo;
    }

    public Todo updateDone(Todo updatedTodo) {
        em.merge(updatedTodo);
        return updatedTodo;
    }

    public Todo updateTodo(Todo updatedTodo) {
        em.merge(updatedTodo);
        return updatedTodo;
    }

    public void delete(Long id) {
        Todo todo = em.find(Todo.class, id);
        if(todo != null) em.remove(todo);
    }
}
