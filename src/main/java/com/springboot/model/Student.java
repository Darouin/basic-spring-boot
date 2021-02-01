package com.springboot.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	private String firstName;

	private String lastName;


}