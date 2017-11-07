package fr.lteconsulting.formation;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path( "movie" )
public class MovieWebService {

	
	
	
	@GET
	@Produces( MediaType.APPLICATION_JSON )
	public List<Movie> getMovies()
	{
		return getMovies();
	}
	
	
	
	
	
}
