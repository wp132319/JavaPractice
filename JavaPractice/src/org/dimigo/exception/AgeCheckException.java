package org.dimigo.exception;

public class AgeCheckException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public AgeCheckException() {
		
	}
	
	public AgeCheckException(Movie movie) {
		super(movie.getTitle() + "은/는 " + movie.getLimitAge() + "세 이상 관람가입니다.");
	}
	
}
