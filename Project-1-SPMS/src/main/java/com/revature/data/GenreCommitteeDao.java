package com.revature.data;

import com.revature.models.GenreCommittee;

/**
 * Not used in current version
 * The current software does not support changing the genre committees
 * @author mwhis
 *
 */
public interface GenreCommitteeDao {
	public GenreCommittee addGenreCommitteeMember(GenreCommittee gc);
	
	public GenreCommittee removeGenreCommitteeMember(GenreCommittee gc);
	
}
