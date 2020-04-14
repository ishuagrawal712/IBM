package com.example.demo.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Todo
{
	private String todoId;
	private String name;

	public Todo(String name)
	{
		this.todoId=UUID.randomUUID().toString();
		this.name=name;
	}
}
