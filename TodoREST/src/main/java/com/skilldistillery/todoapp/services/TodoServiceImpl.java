package com.skilldistillery.todoapp.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.todoapp.entities.Todo;
import com.skilldistillery.todoapp.repositories.TodoRepository;
import com.skilldistillery.todoapp.repositories.UserRepository;

@Service
public class TodoServiceImpl implements TodoService {
	
	@Autowired
	TodoRepository todoRepo;
	
	@Autowired
	UserRepository userRepo;

	@Override
	public Set<Todo> index(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Todo show(String username, int tid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Todo create(String username, Todo todo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Todo update(String username, int tid, Todo todo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy(String username, int tid) {
		// TODO Auto-generated method stub
		
	}

}
