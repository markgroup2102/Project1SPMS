package com.revature.models;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="priority")
public class Priority {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="level")
	private String level;
	
	@Override
	public int hashCode() {
		return Objects.hash(level);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Priority other = (Priority) obj;
		return Objects.equals(level, other.level);
	}

	@Override
	public String toString() {
		return "Priority [level=" + level + "]";
	}

	public Priority() {
		// TODO Auto-generated constructor stub
	}

}
