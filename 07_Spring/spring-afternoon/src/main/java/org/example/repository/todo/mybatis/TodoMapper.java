package org.example.repository.todo.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.domain.todo.TodoMybatis;

import java.util.List;

@Mapper
public interface TodoMapper {
    public List<TodoMybatis> findAll();
    public TodoMybatis findById(@Param("id") Long id);
    public int save(TodoMybatis newTodoMybtis);
    public int updateDone(TodoMybatis updateTodoMybtis);
    public int updateTodo(TodoMybatis updateTodoMybtis);
    public int delete(Long id);
}
