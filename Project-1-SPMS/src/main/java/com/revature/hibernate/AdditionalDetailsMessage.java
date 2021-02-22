package com.revature.hibernate;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="additional_details_messages")
public class AdditionalDetailsMessage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="request_id")
	private Integer id;
	
	@Column(name="sender_id")
	private Integer senderId;
	
	@Column(name="receiver_id")
	private Integer receiverId; // who the message is going to
	
	@Column(name="story_id")
	private Integer storyId;
	
	@Column(name="message_text")
	private String messageText;
	
	public AdditionalDetailsMessage() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	private void setId(Integer id) {
		this.id = id;
	}

	public Integer getSenderId() {
		return senderId;
	}

	public void setSenderId(Integer senderId) {
		this.senderId = senderId;
	}

	public Integer getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(Integer receiverId) {
		this.receiverId = receiverId;
	}

	public Integer getStoryId() {
		return storyId;
	}

	public void setStoryId(Integer storyId) {
		this.storyId = storyId;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	@Override
	public String toString() {
		return "AdditionalDetailsMessage [id=" + id + ", senderId=" + senderId + ", receiverId=" + receiverId
				+ ", storyId=" + storyId + ", messageText=" + messageText + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, messageText, receiverId, senderId, storyId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdditionalDetailsMessage other = (AdditionalDetailsMessage) obj;
		return Objects.equals(id, other.id) && Objects.equals(messageText, other.messageText)
				&& Objects.equals(receiverId, other.receiverId) && Objects.equals(senderId, other.senderId)
				&& Objects.equals(storyId, other.storyId);
	}
	
}
