package com.example.demo2;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.SQLInsert;

@Entity
@Table(name = "testuser")
@SQLInsert(sql=" replace into testuser (name, id) values(?, ?)")
public class User implements Serializable {

	@Id
	@Column(unique = true)
	protected Long id;

	@Column(name = "name")
	protected String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
