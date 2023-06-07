package com.portfolio.Entit;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import com.portfolio.validations.*;

@Entity
@Table(name="queryforms")
public class queryForm {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	 private int Id;
	 
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@Column(name="username")
	 private String userName;
	 
	
	@Column(name="gmail")
	@gmail
	 private String gmail;
	
	@Column(name="age")
	private int age;
	
	@Column(name="description")
	private String Description;
	
	 
	public queryForm(int id, String userName, String gmail, int age, String description) {
		super();
		Id = id;
		this.userName = userName;
		this.gmail = gmail;
		this.age = age;
		Description = description;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public queryForm() {
		
	}

	public queryForm(String userName, String gmail) {
		super();
		this.userName = userName;
		this.gmail = gmail;
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	
	 
}
