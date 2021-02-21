package com.revature.hibernate;

import javax.persistence.*;
import java.util.Objects;

public class Genre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="genre")
	private String genre;
	
	public Genre() {
		// TODO Auto-generated constructor stub
	}
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Genre [genre=" + genre + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(genre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Genre other = (Genre) obj;
		return Objects.equals(genre, other.genre);
	}
	
	
	

}
