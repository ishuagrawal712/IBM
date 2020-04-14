package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {

	private String name = "Ishu";
	private int age = 21;
	private float height = 5.8f;
	private boolean isProgrammer = true;
	private Address address;
	
}
