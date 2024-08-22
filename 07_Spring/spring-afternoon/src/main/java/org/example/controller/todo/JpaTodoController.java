package org.example.controller.todo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.domain.todo.Todo;
import org.example.repository.todo.jpa.JpaTodoRepository;
import org.example.repository.todo.mybatis.TodoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@Transactional
@RequestMapping("/todo/jpa")
public class JpaTodoController {
    private final JpaTodoRepository jpaTodoRepository;

    @GetMapping("/show")
    public ResponseEntity<List<Todo>> findAll() {
        List<Todo> todoList = jpaTodoRepository.findAll();
        return ResponseEntity.ok(todoList);
    }

    @GetMapping("/show/{id}")
    public ResponseEntity<Todo> findById(@PathVariable Long id) {
        Todo findTodo = jpaTodoRepository.findById(id);
        if (findTodo == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(findTodo);
    }

    @PostMapping("/save")
    public ResponseEntity<Todo> save(
            @RequestParam("todo") String todo ,
            @RequestParam("done") boolean done
    ) {
        Todo newTodo = new Todo(null, todo, done);
        Todo addedTodo = jpaTodoRepository.save(newTodo);
        if(addedTodo == null) return ResponseEntity.internalServerError().build();
        return ResponseEntity.ok(addedTodo);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Todo> updateDone(@PathVariable Long id) {
        Todo updatedTodo = jpaTodoRepository.findById(id);
        if (updatedTodo == null) return ResponseEntity.notFound().build();
        updatedTodo.setDone(!updatedTodo.isDone());
        jpaTodoRepository.updateDone(updatedTodo);
        return ResponseEntity.ok(updatedTodo);
    }

    @PutMapping("/update/{id}/{todo}")
    public ResponseEntity<Todo> updateTodo(
            @PathVariable Long id,
            @PathVariable String todo
    ) {
        Todo updatedTodo = jpaTodoRepository.findById(id);
        if (updatedTodo == null) return ResponseEntity.notFound().build();
        updatedTodo.setTodo(todo);
        jpaTodoRepository.updateTodo(updatedTodo);
        return ResponseEntity.ok(updatedTodo);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Todo> delete(@PathVariable Long id) {
        Todo todo = jpaTodoRepository.findById(id);
        if (todo == null) return ResponseEntity.notFound().build();

        jpaTodoRepository.delete(id);
        return ResponseEntity.ok(todo);
    }
}
