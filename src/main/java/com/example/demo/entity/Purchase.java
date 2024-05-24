package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Purchase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id;

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getPrice() {
		return price;
	}

	private String name;

	private Integer price;

}
