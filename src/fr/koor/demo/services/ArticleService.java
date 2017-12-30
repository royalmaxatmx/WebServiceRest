package fr.koor.demo.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.koor.demo.business.Article;
import fr.koor.demo.business.Database;

@Path("/article") 
public class ArticleService { 

	@GET
	@Path("/get/{idArticle}")
	@Produces( MediaType.TEXT_PLAIN)
	public String getArticleById( @PathParam( "idArticle" ) int idArticle) {
		return Database.stock[idArticle].toString();
	}
	
	 @GET
	 @Path( "/getall" )
	 @Produces( MediaType.TEXT_PLAIN )
	public String getArticles() {
		return Database.stock.toString();
	}
	
	 @PUT
	 @Path( "/update" )
	 @Consumes( MediaType.APPLICATION_JSON)
	 @Produces( MediaType.TEXT_PLAIN)
	public boolean updateArticle(Article article) {
		System.out.println("receive update for" + article);
		Database.stock[ article.getIdArticle()] = article;
		return true;
	}
}
