package com.skilldistillery.todoapp.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String task;
	
	private String description;
	
	private boolean completed;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="due_date")
	private String dueDate;
	
	@Column(name="complete_date")
	private String completeDate;
	
	@Column(name="created_at")
	private Date createdAt;
	
	@Column(name="updated_at")
	private Date updatedAt;

}
