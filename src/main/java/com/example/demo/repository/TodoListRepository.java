package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.TodoList;

public interface TodoListRepository extends JpaRepository<TodoList,Integer> {

}
