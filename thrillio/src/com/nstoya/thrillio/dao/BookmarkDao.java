package com.nstoya.thrillio.dao;

import com.nstoya.thrillio.DataStore;
import com.nstoya.thrillio.entities.Bookmark;

public class BookmarkDao {

	public Bookmark[][] getBookmarks() {
		return DataStore.getBookmarks();
		
	}
}
