package com.revature.hibernate;

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
	

}
