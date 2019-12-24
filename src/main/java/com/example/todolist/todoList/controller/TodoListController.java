package com.example.todolist.todoList.controller;

import com.example.todolist.todoList.model.ListItem;
import com.example.todolist.todoList.model.TodoList;
import com.example.todolist.todoList.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoListController {
@Autowired
private TodoListService todoListService;

    @RequestMapping(method = RequestMethod.GET,value = "/api/todo")
    public List<TodoList> getTodos()
    {
        return todoListService.getAllTodoList();
    }

    @RequestMapping(method = RequestMethod.GET ,value = "/api/todo/{listId}")
    public TodoList getTodoList(@PathVariable("listId") int listId)
    {
        return todoListService.getTodoList(listId);
    }

    @PostMapping
    @RequestMapping(value = "/api/todo")
    public void addTodoList(@RequestBody TodoList todoList)
    {
        todoListService.AddTodoList(todoList);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/api/todo/{listId}")
    public void deleteTodoList(@PathVariable("listId") int listId)
    {
        todoListService.deleteTodoList(listId);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/api/todo/{listId}/{itemId}")
    public void updateListItem(@RequestBody ListItem listItem,@PathVariable("listId") int listId,@PathVariable("itemId") int itemId)
    {
        todoListService.updateListItem(listItem,listId,itemId);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/api/todo/{listId}/{itemId}")
    public void deleteListItem(@PathVariable("listId") int listId,@PathVariable("itemId") int itemId)
    {
        todoListService.deleteListItem(listId,itemId);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/api/todo/{listId}")
    public void addListItem(@RequestBody ListItem listItem,@PathVariable("listId") int listId)
    {
        todoListService.addListItem(listItem,listId);
    }
}
