package com.zhou.todo.service;

import com.zhou.todo.entity.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> selectAll();
}
