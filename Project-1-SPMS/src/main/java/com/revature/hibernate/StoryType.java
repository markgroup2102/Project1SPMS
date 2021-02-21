package com.revature.hibernate;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "story_type")
public class StoryType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "type_id")
	private  Integer id;
	
	@Column(name = "type")
	private String type;
	
	@Column(name="weighted_value")
	private Integer weightedValue;
	public StoryType() {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	private void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getWeightedValue() {
		return weightedValue;
	}
	public void setWeightedValue(Integer weightedValue) {
		this.weightedValue = weightedValue;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, type, weightedValue);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StoryType other = (StoryType) obj;
		return Objects.equals(id, other.id) && Objects.equals(type, other.type)
				&& Objects.equals(weightedValue, other.weightedValue);
	}
	@Override
	public String toString() {
		return "StoryType [id=" + id + ", type=" + type + ", weightedValue=" + weightedValue + "]";
	}
	
	

}
