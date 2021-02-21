package com.revature.hibernate;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "people")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Embedded
	@Column(name = "role")
	private Role role;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "points_in_queue")
	private Integer pointsInQueue; 
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Integer getId() {
		return id;
	}
	private void setId(Integer id) {
		this.id = id;
	}
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getPoints_in_queue() {
		return pointsInQueue;
	}
	public void setPoints_in_queue(Integer points_in_queue) {
		this.pointsInQueue = points_in_queue;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(firstName, id, lastName, pointsInQueue, role);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(id, other.id)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(pointsInQueue, other.pointsInQueue)
				&& Objects.equals(role, other.role);
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", role=" + role + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", pointsInQueue=" + pointsInQueue + "]";
	}

}
