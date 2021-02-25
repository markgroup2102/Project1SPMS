import static org.junit.jupiter.api.Assertions.*;

import org.hibernate.Session;
import org.junit.jupiter.api.Test;

import com.revature.models.AdditionalDetailsMessage;
import com.revature.models.GenreCommittee;
import com.revature.models.Person;
import com.revature.models.StoryApprovalHistory;
import com.revature.models.StoryArtifact;
import com.revature.models.StoryDraft;
import com.revature.models.StoryPitch;
import com.revature.utilities.HibernateUtil;

class Testing {

	@Test
	void testPersonStructure() {
		HibernateUtil hu = HibernateUtil.getHibernateUtil();
		Session sesh = hu.getSession();
		Person p = sesh.get(Person.class, 3);
		System.out.println(p.toString());
		sesh.close();
	}
	
	@Test
	void testMessageStructure() {
		HibernateUtil hu = HibernateUtil.getHibernateUtil();
		Session sesh = hu.getSession();
		AdditionalDetailsMessage adm = sesh.get(AdditionalDetailsMessage.class, 3);
		if(adm==null) {
			System.out.println("null");
		}else {
			System.out.println(adm.toString());
		}
		
		sesh.close();
	}
	
	@Test
	void GenreCommitteeTest() {
		HibernateUtil hu = HibernateUtil.getHibernateUtil();
		Session sesh = hu.getSession();
		GenreCommittee testObj = sesh.get(GenreCommittee.class, 3);
		if(testObj==null) {
			System.out.println("null");
		}else {
			System.out.println(testObj.toString());
		}
		sesh.close();
	}
	
	@Test
	void StoryApprovalHistoryTest() {
		HibernateUtil hu = HibernateUtil.getHibernateUtil();
		Session sesh = hu.getSession();
		StoryApprovalHistory testObj = sesh.get(StoryApprovalHistory.class, 3);
		if(testObj==null) {
			System.out.println("null");
		}else {
			System.out.println(testObj.toString());
		}
		sesh.close();
	}
	
	@Test
	void StoryArtifactTest() {
		HibernateUtil hu = HibernateUtil.getHibernateUtil();
		Session sesh = hu.getSession();
		StoryArtifact testObj = sesh.get(StoryArtifact.class, 3);
		if(testObj==null) {
			System.out.println("null");
		}else {
			System.out.println(testObj.toString());
		}
		sesh.close();
	}
	
	@Test
	void StoryDraftTest() {
		HibernateUtil hu = HibernateUtil.getHibernateUtil();
		Session sesh = hu.getSession();
		StoryDraft testObj = sesh.get(StoryDraft.class, 3);
		if(testObj==null) {
			System.out.println("null");
		}else {
			System.out.println(testObj.toString());
		}
		sesh.close();
	}
	
	@Test
	void StoryPitchTest() {
		HibernateUtil hu = HibernateUtil.getHibernateUtil();
		Session sesh = hu.getSession();
		StoryPitch testObj = sesh.get(StoryPitch.class, 3);
		if(testObj==null) {
			System.out.println("null");
		}else {
			System.out.println(testObj.toString());
		}
		sesh.close();
	}

}
