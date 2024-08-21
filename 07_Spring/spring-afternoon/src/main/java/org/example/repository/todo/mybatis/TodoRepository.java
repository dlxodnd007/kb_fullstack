package org.example.repository.todo.mybatis;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.example.domain.todo.TodoMybatis;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TodoRepository {
    private final TodoMapper todoMapper;

    public List<TodoMybatis> findAll() {
        return todoMapper.findAll();
    }

    public TodoMybatis findById(Long id) {
        return todoMapper.findById(id);
    }

    public int save(TodoMybatis newTodoMybtis) {
        return todoMapper.save(newTodoMybtis);
    }

    public int updateDone(TodoMybatis updateTodoMybtis) {
        return todoMapper.updateDone(updateTodoMybtis);
    }

    public int updateTodo(TodoMybatis updateTodoMybtis) {
        return todoMapper.updateTodo(updateTodoMybtis);
    }

    public int delete(Long id) {
        return todoMapper.delete(id);
    }
}
