package org.example.controller.todo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.domain.book.BookMybatis;
import org.example.domain.todo.TodoMybatis;
import org.example.repository.todo.mybatis.TodoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
//@RequestMapping(value = "/todo/mybatis")
@RequestMapping(value = "/todo")
public class MybatisTodoController {
    private final TodoRepository todoRepository;

    //@GetMapping("/show")
    @GetMapping("")
    public ResponseEntity<List<TodoMybatis>> findAll() {
        List<TodoMybatis> todos = todoRepository.findAll();
        return ResponseEntity.ok(todos);
    }

    //@GetMapping("/show/{id}")
    @GetMapping("/{id}")
    public ResponseEntity<TodoMybatis> findById(@PathVariable("id") Long id) {
        TodoMybatis findTodo = todoRepository.findById(id);

        if (findTodo == null) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(findTodo);
    }

    //@PostMapping("/save")
    @PostMapping("/{todo}")
    public ResponseEntity<TodoMybatis> save(
            @PathVariable("todo") String todo
    ) {
        TodoMybatis newTodo = new TodoMybatis(null, todo, false);
        int affectedRows = todoRepository.save(newTodo);

        if (affectedRows == 0) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        } else {
            return ResponseEntity.status(HttpStatus.CREATED).body(newTodo);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<TodoMybatis> updateDone(
            @PathVariable("id") Long id
    ) {
        TodoMybatis findTodo = todoRepository.findById(id);

        if (findTodo == null) ResponseEntity.notFound().build();

        findTodo.setDone(!findTodo.isDone());
        System.out.println("#############################" + findTodo.toString());

        int affectedRows = todoRepository.updateDone(findTodo);

        if (affectedRows == 0) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        } else {
            return ResponseEntity.status(HttpStatus.CREATED).body(findTodo);
        }

    }

    //@PutMapping("/update/{id}/{todo}")
    @PutMapping("/update/{id}/{todo}")
    public ResponseEntity<TodoMybatis> updateTodo(
            @PathVariable("id") Long id,
            @PathVariable("todo") String todo
    ) {
        TodoMybatis findTodo = todoRepository.findById(id);

        if (findTodo == null) ResponseEntity.notFound().build();

        findTodo.setTodo(todo);

        int affectedRows = todoRepository.updateTodo(findTodo);

        if (affectedRows == 0) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        } else {
            return ResponseEntity.status(HttpStatus.CREATED).body(findTodo);
        }

    }

    //@DeleteMapping(value = "/delete/{id}", produces = "text/plain;charset=UTF-8")
    @DeleteMapping(value = "/{id}", produces = "text/plain;charset=UTF-8")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        int affectedRows = todoRepository.delete(id);
        if (affectedRows == 0) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("게시글 삭제 실패");

        return ResponseEntity.ok("게시글 삭제 성공");
    }
}
