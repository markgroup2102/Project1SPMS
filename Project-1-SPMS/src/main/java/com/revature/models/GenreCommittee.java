package com.revature.models;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "genre_committees")
public class GenreCommittee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="tracking_id")
	private Integer id;
	
	@Column(name = "person_id")
	private Integer personId;
	
	@Column(name = "genre")
	private String genre;
	public Integer getId() {
		return id;
	}
	private void setId(Integer id) {
		this.id = id;
	}
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public GenreCommittee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "GenreCommittee [id=" + id + ", personId=" + personId + ", genre=" + genre + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(genre, id, personId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GenreCommittee other = (GenreCommittee) obj;
		return Objects.equals(genre, other.genre) && Objects.equals(id, other.id)
				&& Objects.equals(personId, other.personId);
	}
	

}
