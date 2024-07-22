package org.examle.todo2;

public interface TodoDao {
    int getTotalCount(String user_id);
    void getTodosByUserId(String userId);
    void getCompletedTodosByUserId(String user_id);
    void getUncompletedTodosUserId(String user_id);
    void makeTodoCompleted(int id, String user_id);
    void createTodo(String todo, String user_id);
    void deleteTodo(int id, String user_id);
    void getAllTodosWithUserName();
}