package fr.lteconsulting.formation;

import java.util.ArrayList;
import java.util.List;


public class Movie {
	
	private String id;
	private String name;
	private int releaseDate;
	private Studio studio;
	private Realisator realisator;
	private List<Actor> actors = new ArrayList<>();
	
	
	
	public List<Actor> getlistActors()
	{
		return actors;
	}
	
	
	public Movie() {
	}
	
	public Movie(String id, String name, int releaseDate, Studio studio, Realisator realisator, List<Actor> actors) {
		this.id = id;
		this.name = name;
		this.releaseDate = releaseDate;
		this.studio = studio;
		this.realisator = realisator;
		this.actors = actors;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Studio getStudio() {
		return studio;
	}
	public void setStudio(Studio studio) {
		this.studio = studio;
	}
	public Realisator getRealisator() {
		return realisator;
	}
	public void setRealisator(Realisator realisator) {
		this.realisator = realisator;
	}
	public List<Actor> getActors() {
		return actors;
	}
	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

	
	
}
