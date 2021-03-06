package com.skilldistillery.todoapp.repositories;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.todoapp.entities.Todo;
import com.skilldistillery.todoapp.entities.User;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
	
	Set<Todo> findByUser(User user);

}
