package com.revature.hibernate;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="story_pitch_status")
public class StoryPitchStatus {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="status")
	private String status;
	@Override
	public String toString() {
		return "StoryPitchStatus [status=" + status + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(status);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StoryPitchStatus other = (StoryPitchStatus) obj;
		return Objects.equals(status, other.status);
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public StoryPitchStatus() {
		// TODO Auto-generated constructor stub
	}

}
