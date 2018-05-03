package com.nstoya.thrillio.entities;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

import com.nstoya.thrillio.constants.BookGenre;
import com.nstoya.thrillio.managers.BookmarkManager;

class BookTest {

	@Test
	void test() {
		//Test 1: book genre is philosophy --false
		Book book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.PHILOSOPHY, 4.3);
		assertFalse("For book genre philosophy should return false", book.isKidFriendyEligible());
		
		//Test2: book genre is self help --false
		BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.SELF_HELP, 4.3);
		
		assertFalse("For book genre philosophy should return false", book.isKidFriendyEligible());
	}

}
