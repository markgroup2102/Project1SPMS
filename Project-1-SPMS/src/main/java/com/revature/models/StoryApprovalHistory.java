package com.revature.models;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="story_approval_history")
public class StoryApprovalHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="approval_id")
	private Integer id;
	
	@Column(name="approver_id")
	private Integer approverId;
	
	@Column(name="story_id")
	private Integer storyId;
	
	@Column(name="status")
	private String status;
	
	@Column(name="entry_date")
	private LocalDate localDate;
	public StoryApprovalHistory() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(approverId, id, localDate, status, storyId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StoryApprovalHistory other = (StoryApprovalHistory) obj;
		return Objects.equals(approverId, other.approverId) && Objects.equals(id, other.id)
				&& Objects.equals(localDate, other.localDate) && Objects.equals(status, other.status)
				&& Objects.equals(storyId, other.storyId);
	}
	@Override
	public String toString() {
		return "StoryApprovalHistory [id=" + id + ", approver_id=" + approverId + ", story_id=" + storyId
				+ ", status=" + status + ", localDate=" + localDate + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getApproverId() {
		return approverId;
	}

	public void setApproverId(Integer approverId) {
		this.approverId = approverId;
	}

	public Integer getStoryId() {
		return storyId;
	}

	public void setStoryId(Integer storyId) {
		this.storyId = storyId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	

}
