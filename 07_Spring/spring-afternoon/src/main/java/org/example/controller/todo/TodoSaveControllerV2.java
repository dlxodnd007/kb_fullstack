package org.example.controller.todo;

import lombok.extern.slf4j.Slf4j;
import org.example.dto.todo.TodoDtoListV1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
public class TodoSaveControllerV2 {
    private TodoDtoListV1 todoList = TodoDtoListV1.getInstance();

    @RequestMapping(value ="/todo/save", method = RequestMethod.GET)
    public String process(HttpServletRequest request) {
        log.info("==========> 회원 추가 Request, /todo/form/save");

        String todo = request.getParameter("todo");
        todoList.addList(todo);

        request.setAttribute("todo", todoList.getList());
        return "todo-show";
    }
}
