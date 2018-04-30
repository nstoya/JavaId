package com.nstoya.thrillio;

import com.nstoya.thrillio.entities.Bookmark;
import com.nstoya.thrillio.entities.User;
import com.nstoya.thrillio.managers.BookmarkManager;
import com.nstoya.thrillio.managers.UserManager;

public class Launch {

	private static User[] users;
	private static Bookmark[][] bookmarks;

	private static void loadData() {
		System.out.println("1. Loading data...");
		DataStore.loadData();
		
		users = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();
		
		System.out.println("Printing data ...");
		printUserData();
		printBookmarkData();
	}
	


	private static void printBookmarkData() {
		for (Bookmark[] bookmarkList: bookmarks) {
			for (Bookmark bookmark: bookmarkList) {
				System.out.println(bookmark);
			}
			
		}
		
	}



	private static void printUserData() {
		for (User user: users) {
			System.out.println(user);
		}
		
	}



	public static void main(String[] args) {
		loadData();

	}

}
