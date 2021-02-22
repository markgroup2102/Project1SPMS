package com.revature.hibernate;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="story_pitches")
public class StoryPitches {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="story_id")
	private Integer id;
	
	@Column(name="author_id")
	private int authorId;
	
	@Column(name="title")
	private String title;
	
	@Column(name="tag_line")
	private String tagLine;
	
	@Column(name="description")
	private String description;
	
	@Column(name="genre")
	private String genre;
	
	@Column(name="page_count")
	private Integer pageCount;
	
	@Column(name="type")
	private String type;
	
	@Column(name="est_comp_date")
	private LocalDate estCompDate;
	
	@Column(name = "status")
	private String status;
	
	@Column(name="priority")
	private String priority;
	
	public StoryPitches() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StoryPitches [id=" + id + ", authorId=" + authorId + ", title=" + title + ", tagLine=" + tagLine
				+ ", description=" + description + ", genre=" + genre + ", pageCount=" + pageCount + ", type=" + type
				+ ", estCompDate=" + estCompDate + ", status=" + status + ", priority=" + priority + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTagLine() {
		return tagLine;
	}

	public void setTagLine(String tagLine) {
		this.tagLine = tagLine;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getEstCompDate() {
		return estCompDate;
	}

	public void setEstCompDate(LocalDate estCompDate) {
		this.estCompDate = estCompDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Override
	public int hashCode() {
		return Objects.hash(authorId, description, estCompDate, genre, id, pageCount, priority, status, tagLine, title,
				type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StoryPitches other = (StoryPitches) obj;
		return authorId == other.authorId && Objects.equals(description, other.description)
				&& Objects.equals(estCompDate, other.estCompDate) && Objects.equals(genre, other.genre)
				&& Objects.equals(id, other.id) && Objects.equals(pageCount, other.pageCount)
				&& Objects.equals(priority, other.priority) && Objects.equals(status, other.status)
				&& Objects.equals(tagLine, other.tagLine) && Objects.equals(title, other.title)
				&& Objects.equals(type, other.type);
	}
	

}
