package com.takeo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="admin")
public class Admin {
	
	@Id
	private long id;
	//@Field("FIRSTNAME")
	private String firstname;
	//@Field("LASTNAME")
	private String lastname;
	//@Field("EMAIL")
	private String email;
	//@Field("USERNAME")
	private String username;
	//@Field("PASSWORD")
	private String password;

}
