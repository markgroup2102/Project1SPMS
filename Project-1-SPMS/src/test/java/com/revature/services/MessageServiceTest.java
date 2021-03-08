package com.revature.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.revature.models.AdditionalDetailsMessage;

class MessageServiceTest {

	@Test
	void testSendNewAdditionalDetailRequest() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAdditionalDetailRequest() {
		MessageService ms = new MessageService();
		AdditionalDetailsMessage adm = new AdditionalDetailsMessage();
		adm.setMessageText("What's the protagonist's last name?");
		adm.setReceiverId(11);
		adm.setSenderId(null);
		adm.setStoryId(8);
		ms.sendNewAdditionalDetailRequest(adm);
	}

	@Test
	void testReplyToAdditionalDetailRequest() {
		fail("Not yet implemented");
	}

}
