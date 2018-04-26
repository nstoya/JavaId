package com.nstoya.thrillio.managers;

import com.nstoya.thrillio.entities.Book;
import com.nstoya.thrillio.entities.Movie;
import com.nstoya.thrillio.entities.Weblink;

public class BookmarkManager {

	private static BookmarkManager instance = new BookmarkManager();

	private BookmarkManager() {

	}

	public static BookmarkManager getInstance() {
		return instance;
	}

	public Movie createMovie(long id, String title, String genre, String profileUrl, double imdbRating, int releaseYear,
			String[] directors, String[] cast) {
		
		Movie movie = new Movie();
		movie.setId(id);
		movie.setTitle(title);
		movie.setProfileUrl(profileUrl);
		movie.setReleaseYear(releaseYear);
		movie.setCast(cast);
		movie.setGenre(genre);
		movie.setImdbRating(imdbRating);
		
		return movie;
	}
	
	public Book createBook() {
		//TODO
		return null;
	}
	
	public Weblink createWeblink() {
		//TODO
		return null;
	}

}
