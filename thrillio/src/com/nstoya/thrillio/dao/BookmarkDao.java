package com.nstoya.thrillio.dao;

import com.nstoya.thrillio.DataStore;
import com.nstoya.thrillio.entities.Bookmark;
import com.nstoya.thrillio.entities.UserBookmark;

public class BookmarkDao {

	public Bookmark[][] getBookmarks() {
		return DataStore.getBookmarks();
		
	}

	public void saveUserBookmark(UserBookmark userBookmark) {
		//typicall sql to save in the db
		DataStore.add(userBookmark);
		
	}
}
