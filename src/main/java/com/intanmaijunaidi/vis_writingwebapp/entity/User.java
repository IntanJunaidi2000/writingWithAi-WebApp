package com.intanmaijunaidi.vis_writingwebapp.entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.*;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name="user", uniqueConstraints = {
	@UniqueConstraint(columnNames = {"username"}),
	@UniqueConstraint(columnNames = {"username"})
})	
public class User {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long id;
	
	@NotBlank(message = "Username is required")
	private String username;
	
	@NotBlank(message = "Email is required")
	private String email;
	
	@NotBlank(message = "Password is required")
	private String password;
	
	@Column(name = "created_at")
	private Date createdAt;
	
	@OneToMany(mappedBy = "user")
	@JsonIgnore
	private List<Document> documents;
	
	public User() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	

}
