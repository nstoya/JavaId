package com.nstoya.thrillio.entities;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

import com.nstoya.thrillio.constants.MovieGenre;
import com.nstoya.thrillio.managers.BookmarkManager;

class MovieTest {

	@Test
	void testIsKidFriendyEligible() {
		
		//Test 1: if genre is thriller --false
		Movie movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.THRILLERS,
				8.5);
		assertFalse("Movie genre thriller should return false", movie.isKidFriendyEligible());
		
		//Test 2: genre is horror --false
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.HORROR,
				8.5);
		assertFalse("Movie genre horror should return false", movie.isKidFriendyEligible());
	}

}
