package fr.koor.demo.business;

public class Article {
	private int idArticle;
	private String description;
	private String Brand;
	private double price; 
	
	public Article() {
		this(0, "unknown", "unknown", 0);
	}

	public Article(int idArticle, String description, String brand, double price) {
		super();
		this.idArticle = idArticle;
		this.description = description;
		Brand = brand;
		this.price = price;
	}

	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Article [idArticle=" + idArticle + ", description=" + description + ", Brand=" + Brand + ", price="
				+ price + "]";
	}
	
	
	
}
