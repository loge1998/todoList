package com.example.todolist.todoList.model;

public class ListItem {

    private int id;
    private String todoItem;

    public ListItem() {
    }

    public ListItem(int id, String todoItem) {
        this.id = id;
        this.todoItem = todoItem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTodoItem(String todoItem) {
        this.todoItem = todoItem;
    }

    public String getTodoItem() {
        return todoItem;
    }
}
