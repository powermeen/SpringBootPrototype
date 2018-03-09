package com.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;







@Entity
@Table(name = "user")
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "i_user_id")
	private int id;
	@Column(name = "c_email")
	@Email(message = "*Please provide a valid Email")
	@NotEmpty(message = "*Please provide an email")
	private String email;
	@Column(name = "c_password")
	@Length(min = 5 ,message = "*Your password must have at least 5 charaters")
	@NotEmpty(message = "*Please provide your password")
	@Transient
	private String password;
	@Column(name = "c_name")
	@NotEmpty(message = "*Please provide your name")
	private String name;
	@Column(name = "c_last_name")
	@NotNull(message = "*Please provide your last name")
	private String lastName;
	@Column(name = "i_active")
	private int active;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "c_user_role",joinColumns = @JoinColumn(name = "i_user_id") ,inverseJoinColumns=  @JoinColumn(name = "i_rold_id") )
	private Set<Role> roles;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
}