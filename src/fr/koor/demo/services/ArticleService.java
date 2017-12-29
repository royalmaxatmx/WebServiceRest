package fr.koor.demo.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.koor.demo.business.Database;

@Path("/article") 
public class ArticleService {

	@GET
	@Path("/get/{idArticle}")
	@Produces( MediaType.TEXT_PLAIN)
	public String getArticleById( int idArticle) {
		return Database.stock[idArticle].toString();
	}
}
