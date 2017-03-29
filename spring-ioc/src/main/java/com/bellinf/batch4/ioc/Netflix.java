package com.bellinf.batch4.ioc;

import java.util.ArrayList;

public class Netflix {

	private MovieFinder movieFinder;
	
	public void setMovieFnd(MovieFinder movieFinder){
		this.movieFinder = movieFinder;
	}
	
	public ArrayList<String> movieList(String userPreference){
		return movieFinder.movieByGenre(userPreference);
		
	}
	
}
