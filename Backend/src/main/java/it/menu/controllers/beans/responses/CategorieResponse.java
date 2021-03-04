package it.menu.controllers.beans.responses;

import it.menu.repositories.entities.Categorie;

public class CategorieResponse extends GenericResponse {
	private Categorie categoria;
	
	public CategorieResponse() {
		super();
	}

	public CategorieResponse(Categorie categoria) {
		super();
		this.categoria = categoria;
	}

	public Categorie getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorie categoria) {
		this.categoria = categoria;
	}
	

}