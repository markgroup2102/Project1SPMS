package com.revature.services;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.revature.data.StoryTypeDao;
import com.revature.hibernate.StoryTypeHibernate;
import com.revature.models.Person;
import com.revature.models.StoryPitch;

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
	void validateNewPitch() {
		StoryPitch storyPitch = new StoryPitch();
		assertFalse(persServ.validatePitchHasAllFields(storyPitch ));	
	}
	
	@Test
	void validateNewPitch1() {
		StoryPitch storyPitch = new StoryPitch();
		storyPitch.setAuthorId(1);
		assertFalse(persServ.validatePitchHasAllFields(storyPitch ));	
	}
	@Test
	void validateNewPitch2() {
		StoryPitch storyPitch = new StoryPitch();
		storyPitch.setAuthorId(1);
		storyPitch.setPageCount(1);
		assertFalse(persServ.validatePitchHasAllFields(storyPitch ));	
	}
	
	@Test
	void validateNewPitch3() {
		StoryPitch storyPitch = new StoryPitch();
		storyPitch.setAuthorId(1);
		storyPitch.setPageCount(1);
		storyPitch.setDescription(" ");
		assertFalse(persServ.validatePitchHasAllFields(storyPitch ));	
	}
	
	@Test
	void validateNewPitch4() {
		StoryPitch storyPitch = new StoryPitch();
		storyPitch.setAuthorId(1);
		storyPitch.setPageCount(1);
		storyPitch.setDescription(" ");
		storyPitch.setGenre("FICTION");
		assertFalse(persServ.validatePitchHasAllFields(storyPitch ));	
	}
	
	@Test
	void validateNewPitch5() {
		StoryPitch storyPitch = new StoryPitch();
		storyPitch.setAuthorId(1);
		storyPitch.setPageCount(1);
		storyPitch.setDescription(" ");
		storyPitch.setGenre("FICTION");
		storyPitch.setTagLine(" ");
		storyPitch.setTitle(" ");
		assertFalse(persServ.validatePitchHasAllFields(storyPitch ));	
	}
	
	@Test
	void testValidateUserIsAuthor() {
		assertTrue(persServ.validateUserIsAuthor(11));
	}
	
	@Test
	void testValidateUserIsAuthorNull() {
		assertFalse(persServ.validateUserIsAuthor(null));
	}
	
	@Test
	void testValidateUserIsAuthorBadRequest() {
		assertFalse(persServ.validateUserIsAuthor(-1));
	}
	
	@Test
	void testValidateUserIsAuthorPersonNotAuthor() {
		assertFalse(persServ.validateUserIsAuthor(1));
	}
	
	@Test
	void testGetIdOfStoryTypeByPageCount() {
		//StoryTypeDao s = new StoryTypeHibernate();
		//s.getAllStoryTypes().forEach(f->System.out.println(f.toString()));;
		//System.out.println(persServ.getIdOfStoryTypeByPageCount(8));
		assertTrue(persServ.getStoryTypeByPageCount(8).getId() == 4);
	}
	
	@Test
	void testGetIdOfStoryTypeByPageCount2() {
		//System.out.println(persServ.getIdOfStoryTypeByPageCount(null));
		assertTrue(persServ.getStoryTypeByPageCount(12).getId() == 3);
	}
	
	@Test
	void testGetIdOfStoryTypeByPageCount3() {
		//System.out.println(persServ.getIdOfStoryTypeByPageCount(null));
		assertTrue(persServ.getStoryTypeByPageCount(21).getId() == 2);
	}
	
	@Test
	void testGetIdOfStoryTypeByPageCount4() {
		//System.out.println(persServ.getIdOfStoryTypeByPageCount(null));
		assertTrue(persServ.getStoryTypeByPageCount(26).getId() == 1);
	}
	
	@Test
	void testGetIdOfStoryTypeByPageCount5() {
		//System.out.println(persServ.getIdOfStoryTypeByPageCount(null));
		assertTrue(persServ.getStoryTypeByPageCount(51).getId() == 1);
	}
	
	@Test
	void testGetIdOfStoryTypeByPageCount6() {
		//System.out.println(persServ.getIdOfStoryTypeByPageCount(null));
		assertTrue(persServ.getStoryTypeByPageCount(-1).getId() == 1);
	}
	
	@Test
	void testGetIdOfStoryTypeByPageCountNull() {
		//System.out.println(persServ.getIdOfStoryTypeByPageCount(null));
		assertTrue(persServ.getStoryTypeByPageCount(null).getId() == 1);
	}

	@Test
	void testSubmitStoryPitchNull() {
		StoryPitch sp = new StoryPitch();
		assertNull(persServ.submitStoryPitch(null));
	}
	
	@Test
	void testSubmitStoryPitchEverthingNull() {
		StoryPitch sp = new StoryPitch();
		sp.setAuthorId(0);
		sp.setDescription(null);
		sp.setEstCompDate(null);
		sp.setPageCount(null);
		sp.setTagLine(null);
		sp.setTitle(null);
		assertNull(persServ.submitStoryPitch(null));
	}
	
	@Test
	// This test will do one of two things to the database 
	// if the author has the points it will add the book to story 
	//    pitches with a status of pending
	//    and then update the author's story point value
	// else it will just add a story pitch with a status of on hold 
	void testSubmitStoryPitchEverthingNotNull() {
		StoryPitch sp = new StoryPitch();
		sp.setAuthorId(11);
		sp.setDescription("Good book");
		sp.setEstCompDate(LocalDate.of(2025, 12, 12));
		sp.setGenre("FAN-FICTION");
		sp.setPageCount(18);
		sp.setTagLine("Good!");
		sp.setTitle("The good book");
		assertNotNull(persServ.submitStoryPitch(sp));
	}

	@Test
	void testGetStoryPitchesByStatusNull() {
		assertNull(persServ.getStoryPitches(11, null));
	}
	
	@Test
	void testGetStoryPitchesByStatusBadCall() {
		assertNull(persServ.getStoryPitches(11, "onhold"));
	}
	
	@Test
	void testGetStoryPitchesByStatusGoodCall() {
		assertNotNull(persServ.getStoryPitches(11, "on-hold"));
	}
	
	@Test
	void testValidateStoryPitchStatusNull() {
		assertFalse(persServ.validateStoryPitchStatus(null));
	}
	
	@Test
	void testValidateStoryPitchStatusBad() {
		assertFalse(persServ.validateStoryPitchStatus("onhold"));
	}
	
	@Test
	void testValidateStoryPitchStatusGood() {
		assertTrue(persServ.validateStoryPitchStatus("on-hold"));
	}
	
	@Test
	void getStoryPitches() {
		System.out.println(persServ.getStoryPitches("pending-level1-approval", "NORMAL", "FAN-FICTION").toString());
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
		//fail("Not yet implemented");
	}

}
