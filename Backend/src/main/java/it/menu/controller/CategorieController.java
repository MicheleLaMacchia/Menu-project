package it.menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.menu.model.entity.Categorie;
import it.menu.model.repository.CategorieRepository;

@RestController
public class CategorieController {

	@Autowired
	private CategorieRepository categorieRepository;

	@RequestMapping(path = "/categorie/lista", method = RequestMethod.GET, produces = "application/json")
	public List<Categorie> getAllCategories() {
		System.out.println("chiamata di getAllCategories");
		List<Categorie> list = null;
		list = categorieRepository.findAll();
		return list;
	}

}
