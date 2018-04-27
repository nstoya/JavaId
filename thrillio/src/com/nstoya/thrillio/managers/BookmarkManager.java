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

	public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast,
			String[] directors, String genre, double imdbRating) {

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

	public Book createBook(long id, String title, int publicationYear, String publisher, String[] authors, String genre,
			double amazonRating) {

		Book b = new Book();
		b.setId(id);
		//b.setProfileUrl(profileUrl);
		b.setAmazonRating(amazonRating);
		b.setTitle(title);
		b.setGenre(genre);
		b.setAuthors(authors);
		b.setPublisher(publisher);
		b.setPublicationYear(publicationYear);

		return b;
	}

	public Weblink createWeblink(long id, String title, String url, String host) {
		Weblink link = new Weblink();
		link.setHost(host);
		link.setUrl(url);
		link.setId(id);
		// link.setProfileUrl(profileUrl);
		link.setTitle(title);
		return link;
	}

}
