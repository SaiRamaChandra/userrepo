package com.user.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users") // optional: to avoid reserved keyword issues
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phoneNumber;
    private String location;
    private String role;
    private String password;

    // No-arg constructor (required by JPA)
    public User() {}

    // All-arg constructor
    public User(Long id, String name, String email, String phoneNumber, String location, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.role= role;
    }

    public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
	    return password;
	}

	public void setPassword(String password) {
	    this.password = password;
	}
	// Getters and setters
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Optional: toString
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
