package it.menu.controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.menu.model.entity.Categorie;
import it.menu.model.repository.CategorieRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/categorie")
public class CategorieController {

	@Autowired
	private CategorieRepository categorieRepository;

	@RequestMapping(path = "/lista", method = RequestMethod.GET, produces = "application/json")
	public List<Categorie> getAllCategories() {
		System.out.println("chiamata di getAllCategories");
		List<Categorie> list = null;
		list = categorieRepository.findAll();
		Collections.sort(list, new Comparator<Categorie>() {
	         @Override
	         public int compare(Categorie s1, Categorie s2) {
	                 return s1.getOrdine() - s2.getOrdine();
	         }
	     });
		return list;
	}

}
