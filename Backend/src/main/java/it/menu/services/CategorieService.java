package it.menu.services;

import java.util.List;

import it.menu.repositories.entities.Categorie;
import it.menu.services.exceptions.ServiceException;

public interface CategorieService {
	
	public Categorie inserisciCategoria(Categorie categoria) throws ServiceException;
	public Categorie modificaCategoria(Categorie categoria) throws ServiceException;
	public Categorie eliminaCategoria(Integer id) throws ServiceException;
	public Categorie eliminaCategoria(String nomeCategoria) throws ServiceException;
	public Categorie ricercaCategoria(String nomeCategoria) throws ServiceException;
	public Categorie ricercaCategoria(Integer id) throws ServiceException;
	public List<Categorie> ricercaCategorie() throws ServiceException;

}
