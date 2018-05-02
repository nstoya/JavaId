package com.nstoya.thrillio.controllers;

import com.nstoya.thrillio.entities.Bookmark;
import com.nstoya.thrillio.entities.User;
import com.nstoya.thrillio.managers.BookmarkManager;

public class BookmarkController {
	private static BookmarkController instance = new BookmarkController();
	
	private BookmarkController() {
		
	}
	
	public static BookmarkController getInstance() {
		return instance;
	}

	public void saveUserBookmark(User user, Bookmark bookmark) {
		BookmarkManager.getInstance().saveUserBookmark(user, bookmark);
		
	}
}
