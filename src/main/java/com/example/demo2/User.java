package com.example.demo2;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.SQLInsert;

@Entity
@Table(name = "testuser")
@SQLInsert(sql=" replace into testuser (name, id) values(?, ?)")
public class User extends BaseEntity{

}
