package it.menu.controllers.beans.responses;

import java.util.List;

import it.menu.repositories.entities.Categorie;

public class CategorieListResponse extends GenericResponse {
	private List<Categorie> categoria;

	public CategorieListResponse(List<Categorie> categoria) {
		super();
		this.categoria = categoria;
	}
	
	public CategorieListResponse() {
		super();
	}

	public List<Categorie> getCategorie() {
		return categoria;
	}

	public void setCategorie(List<Categorie> categoria) {
		this.categoria = categoria;
	}
	

}