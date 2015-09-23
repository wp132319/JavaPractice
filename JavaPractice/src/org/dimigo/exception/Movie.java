package org.dimigo.exception;

public class Movie {
	
	String title;
	int    limitAge;
	
	public Movie(String title, int limitAge) {
		this.title    = title;
		this.limitAge = limitAge;
	}

	public String getTitle() {
		return title;
	}

	public int getLimitAge() {
		return limitAge;
	}
	
}
