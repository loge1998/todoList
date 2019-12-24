package com.example.todolist.todoList.model;

import java.util.ArrayList;

public class TodoList {

    private int listId;
    private ArrayList<ListItem> todoList = new ArrayList<ListItem>();

    public TodoList(ArrayList<ListItem> todoList,int id) {
        this.todoList = todoList;
        this.listId = id;
    }

    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }

    public ArrayList<ListItem> getTodoList() {
        return todoList;
    }

    public void setTodoList(ArrayList<ListItem> todoList) {
        this.todoList = todoList;
    }

    public void addTodoItem(ListItem item)
    {
        todoList.add(item);
    }

    public void updateTodoItem(ListItem item,int id)
    {
        for(int i=0 ;i<todoList.size();i++)
        {
            if(todoList.get(i).getId()==id)
            {
                todoList.set(i,item);
                break;
            }
        }
    }

    public void deleteTodoItem(int id)
    {
        for(int i=0 ;i<todoList.size();i++)
        {
            if(todoList.get(i).getId()==id)
            {
                todoList.remove(i);
                break;
            }
        }
    }



}
