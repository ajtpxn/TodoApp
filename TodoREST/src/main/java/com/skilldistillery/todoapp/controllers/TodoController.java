package com.skilldistillery.todoapp.controllers;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.todoapp.entities.Todo;
import com.skilldistillery.todoapp.services.TodoService;

@RestController
@RequestMapping(path = "api")
@CrossOrigin({ "*", "http://localhost:4201" })
public class TodoController {
	
	private String username = "shaun";

	@Autowired
	TodoService todoSer;

	@GetMapping("todos")
	public Set<Todo> index(HttpServletRequest req, HttpServletResponse res) {
		return todoSer.index(username);
	}

	@GetMapping("todos/{tid}")
	public Todo show(HttpServletRequest req, HttpServletResponse res, @PathVariable("tid") int tid) {
		return todoSer.show(username, tid);
	}

	@PostMapping("todos")
	public Todo create(HttpServletRequest req, HttpServletResponse res, @RequestBody Todo todo) {
		System.out.println(todo);
		return todoSer.create(username, todo);
	}

	@PutMapping("todos/{tid}")
	public Todo update(HttpServletRequest req, HttpServletResponse res, @PathVariable("tid") int tid, @RequestBody Todo todo) {
		return todoSer.update(username, tid, todo);
	}

	@DeleteMapping("todos/{tid}")
	public Boolean destroy(HttpServletRequest req, HttpServletResponse res, @PathVariable("tid") int tid) {
		todoSer.destroy(username, tid);
		return true;
	}

}
