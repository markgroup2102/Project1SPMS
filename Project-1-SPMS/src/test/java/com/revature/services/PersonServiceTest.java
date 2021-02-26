package com.revature.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.revature.models.Person;

class PersonServiceTest {
	
	
	private PersonService persServ;
	@BeforeEach
	private void setup() {
		persServ = new PersonService();
	}
	
	@Test
	void testPersonService() {
		assertNotNull(persServ);
	}

	@Test
	void testGetPersonById() {
		//Person p = new Person();
		//p
		Person p = persServ.getPersonById(1);
		assertTrue(p.getId() == 1);
	}
	
	@Test
	void testGetPersonByIdBadEntry() {
		//Person p = new Person();
		//p
		Person p = persServ.getPersonById(1);
		assertFalse(p.getId() == -1);
	}
	
	@Test
	void testGetPersonByIdInvalidEntry() {
		Person p = persServ.getPersonById(null);
		assertNull(p);
	}

	@Test
	void testSubmitStoryPitch() {
		fail("Not yet implemented");
	}

	@Test
	void testGetStoryPitches() {
		fail("Not yet implemented");
	}

	@Test
	void testSubmitNewPitch() {
		fail("Not yet implemented");
	}

	@Test
	void testSubmitPitchOnHold() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPitchesOnHold() {
		fail("Not yet implemented");
	}

	@Test
	void testApprovePitch() {
		fail("Not yet implemented");
	}

	@Test
	void testRejectPitch() {
		fail("Not yet implemented");
	}

	@Test
	void testSubmitDraft() {
		fail("Not yet implemented");
	}

	@Test
	void testApproveDraft() {
		fail("Not yet implemented");
	}

	@Test
	void testRequestChangesToDraft() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPoints() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdatePersonPointTotal() {
		fail("Not yet implemented");
	}

}
