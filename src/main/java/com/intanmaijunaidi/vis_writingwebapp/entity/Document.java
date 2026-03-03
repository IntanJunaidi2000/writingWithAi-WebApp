package com.intanmaijunaidi.vis_writingwebapp.entity;

import java.util.Date;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Document {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@NotBlank(message = "Title is required")
	private String title;
	
	@Column(columnDefinition = "LONGTEXT")
	private String content;
	
	@NotBlank(message = "File Path is required")
	@Column(name = "file_path")
	private String filePath;
	
	@Column(name = "created_at")
	private Date createdAt;
	
	@Column(name = "last_modified")
	private Date lastModified;

	public Document() {
		
	}
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}
	
	
	

}
