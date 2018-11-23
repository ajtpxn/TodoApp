package com.skilldistillery.todoapp.controllers;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.todoapp.entities.Todo;

@RestController
@RequestMapping(path="api")
@CrossOrigin({"*", "http://localhost:4200"})
public class TodoController {
	
//  GET todos
public Set<Todo> index(HttpServletRequest req, HttpServletResponse res) {
	return null;
}

//  GET todos/{tid}
public Todo show(HttpServletRequest req, HttpServletResponse res, int tid){
	return null;
}

//  POST todos
public Todo create(HttpServletRequest req, HttpServletResponse res, Todo todo){
	return null;
}

//  PUT todos/{tid}
public Todo update(HttpServletRequest req, HttpServletResponse res, int tid, Todo todo){
	return null;
}

//  DELETE todos/{tid}
public Boolean destroy(HttpServletRequest req, HttpServletResponse res, int tid){
	return null;
}

}
