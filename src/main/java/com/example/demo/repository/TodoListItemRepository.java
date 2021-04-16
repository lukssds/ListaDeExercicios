package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.TodoList;
import com.example.demo.domain.TodoListItem;

public interface TodoListItemRepository extends JpaRepository<TodoListItem,Integer> {

}
