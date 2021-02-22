package com.revature.hibernate;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "story_drafts")
public class StoryDraft {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="id")
	private Integer id;
	
	@Column(name = "story_id")
	private Integer storyId;
	
	@Column(name ="draft_link")
	private String link;
	
	public Integer getId() {
		return id;
	}

	private void setId(Integer id) {
		this.id = id;
	}

	public Integer getStoryId() {
		return storyId;
	}

	public void setStoryId(Integer storyId) {
		this.storyId = storyId;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, link, storyId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StoryDraft other = (StoryDraft) obj;
		return Objects.equals(id, other.id) && Objects.equals(link, other.link)
				&& Objects.equals(storyId, other.storyId);
	}

	@Override
	public String toString() {
		return "StoryDraft [id=" + id + ", storyId=" + storyId + ", link=" + link + "]";
	}

	public StoryDraft() {
		// TODO Auto-generated constructor stub
	}

}
