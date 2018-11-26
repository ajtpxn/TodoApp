package com.skilldistillery.todoapp.services;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.todoapp.entities.Todo;
import com.skilldistillery.todoapp.entities.User;
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
		User user = userRepo.findByUsername(username);
		return todoRepo.findByUser(user);
	}

	@Override
	public Todo show(String username, int tid) {
		Optional<Todo> opt = todoRepo.findById(tid);
		Todo todo = null;
		if (opt.isPresent()) {
			todo = opt.get();
		}
		return todo;
	}

	@Override
	public Todo create(String username, Todo todo) {
		return todoRepo.save(todo);
	}

	@Override
	public Todo update(String username, int tid, Todo todo) {
		Optional<Todo> opt = todoRepo.findById(tid);
		Todo newTodo = null;
		if (opt.isPresent()) {
			newTodo = opt.get();
		}
		newTodo.setCompleted(todo.getCompleted());
		newTodo.setCompleteDate(todo.getCompleteDate());
		newTodo.setDescription(todo.getDescription());
		newTodo.setDueDate(todo.getDueDate());
		newTodo.setTask(todo.getTask());
		newTodo.setUser(todo.getUser());
		todoRepo.flush();
		return newTodo;
	}

	@Override
	public void destroy(String username, int tid) {
		todoRepo.deleteById(tid);
	}

}
