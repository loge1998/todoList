package com.example.todolist.todoList.service;

import com.example.todolist.todoList.model.ListItem;
import com.example.todolist.todoList.model.TodoList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TodoListService {

    ArrayList<TodoList> database =  new ArrayList<TodoList>();

    public ArrayList<TodoList> getAllTodoList()
    {
        return database;
    }

    public void AddTodoList(TodoList list)
    {
        database.add(list);
    }

    public TodoList getTodoList(int id)
    {
        return database.stream().filter(list -> list.getListId() == id).findFirst().get();
    }

    public void deleteTodoList(int id)
    {
        for(int index=0;index<database.size();index++)
        {
            if(database.get(index).getListId() == id)
            {
                database.remove(index);
            }
        }
    }

    public void deleteListItem(int ListId,int Itemid)
    {
        for(int index = 0; index<database.size();index++)
        {
            if(database.get(index).getListId() == ListId)
            {
                database.get(index).deleteTodoItem(Itemid);
            }
        }
    }

    public void addListItem(ListItem listItem , int ListId)
    {
        for(int index = 0; index<database.size();index++)
        {
            if(database.get(index).getListId() == ListId)
            {
                database.get(index).addTodoItem(listItem);
            }
        }
    }

    public void updateListItem(ListItem listItem,int ListId,int ItemId)
    {
        for(int index = 0; index<database.size();index++)
        {
            if(database.get(index).getListId() == ListId)
            {
                database.get(index).updateTodoItem(listItem,ItemId);
            }
        }
    }



}
