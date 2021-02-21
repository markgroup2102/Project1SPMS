package com.revature.hibernate;

import java.util.Objects;
import javax.persistence.*;

//@Entity  // this maps the object to a table 
@Embeddable
@Table(name = "roles")
public class Role {

	private String type;
	public Role() {
		
	}
	
	@Id      
	    // tells hibernate this is the id column of the table 
	@Column(name = "role") 
	    // maps the column name 
	//@GeneratedValue(strategy = GenerationType.IDENTITY) 
	    // normally this would tell hibernate that this field is auto incremented 
		// If we had more fields hibernate would auto map them 
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Role [type=" + type + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		return Objects.equals(type, other.type);
	}
	

}
