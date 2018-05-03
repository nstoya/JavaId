package com.nstoya.thrillio.entities;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.nstoya.thrillio.managers.BookmarkManager;

class WeblinkTest {

	@Test
	void testIsKidFriendyEligible() {
		//Test 1: porn in url --false
		Weblink weblink = BookmarkManager.getInstance().createWeblink(2000, "Taming Tiger, Part 22",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger-porn--part-2.html",
				"http://www.javaworld.com");
		boolean isKidFriendlyEligible = weblink.isKidFriendyEligible();
		assertFalse("For porn in url - isKidFriendlyEligible() must return false", isKidFriendlyEligible);

		//Test 2: pron in title -- false
		weblink = BookmarkManager.getInstance().createWeblink(2000, "Taming porn, Part 22",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworld.com");
		isKidFriendlyEligible = weblink.isKidFriendyEligible();
		assertFalse("For porn in title - isKidFriendlyEligible() must return false", isKidFriendlyEligible);
		
		//Test 3: adult in host --false
		weblink = BookmarkManager.getInstance().createWeblink(2000, "Taming Tiger, Part 22",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.adult.com");
		isKidFriendlyEligible = weblink.isKidFriendyEligible();
		assertFalse("For adult in host - isKidFriendlyEligible() must return false", isKidFriendlyEligible);
		
		
		//Test 4: adult in url, but not in host --true
		weblink = BookmarkManager.getInstance().createWeblink(2000, "Taming Tiger, Part 22",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger-adult-part-2.html",
				"http://www.javaworld.com");
		isKidFriendlyEligible = weblink.isKidFriendyEligible();
		assertTrue("For adult in url but not host - isKidFriendlyEligible() must return true", isKidFriendlyEligible);
		
		//Test 5: adult in title only --true
		weblink = BookmarkManager.getInstance().createWeblink(2000, "Taming Tiger adult, Part 22",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworld.com");
		isKidFriendlyEligible = weblink.isKidFriendyEligible();
		assertTrue("For adult in title - isKidFriendlyEligible() must return true", isKidFriendlyEligible);
	}

}
