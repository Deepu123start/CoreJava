package com.bellinf.batch4.ioc;

import java.util.ArrayList;

public class MovieFinder {
	
	private static ArrayList<String> comedyMovies = new ArrayList();
	private static ArrayList<String> actionMovies = new ArrayList();
	private static ArrayList<String> thrillerMovies = new ArrayList();
	
	public MovieFinder() {
		loadMovies();
	}

	public ArrayList<String> movieByGenre(String userPreference){
		if(userPreference.equalsIgnoreCase("thriller")){
			return thrillerMovies;
		} else if(userPreference.equalsIgnoreCase("action")){
			return actionMovies;
		} else if(userPreference.equalsIgnoreCase("comedy")){
			return comedyMovies;
		}
		
		return null;
	}
	
	
	private void loadMovies(){
		comedyMovies.add("American Pie");
		comedyMovies.add("Fly Paper");
		
		actionMovies.add("gladiator");
		actionMovies.add("taken");
		
		thrillerMovies.add("prision break");
		thrillerMovies.add("Narcos");
	}
	
}
