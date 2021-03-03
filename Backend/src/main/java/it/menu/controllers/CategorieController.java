package it.menu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.menu.controllers.exceptions.ControllerException;
import it.menu.repositories.entities.Categorie;
import it.menu.services.CategorieService;
import it.menu.services.exceptions.ServiceException;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/categorie")
public class CategorieController extends BaseController {

	@Autowired
	private CategorieService categorieService;

	@RequestMapping(path = "/lista", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Categorie>> getAllCategories() throws ControllerException {
		
		List<Categorie> list = null;

		try {

			list = categorieService.ricercaCategorie();


		} catch(ServiceException e) {
			ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return ResponseEntity.ok().body(list);
	}

	/*
	@RequestMapping(path = "/id/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getById(@PathVariable("id")Integer id) {
		
		System.out.println("chiamata di getById("+id+")");
		
		Categorie categoria = null;
		
		try {
			
			categoria = categorieBusiness.ricercaCategoria(id);
			
		} catch (ExceptionBusiness exc) {
			return new ResponseEntity<ExceptionBusiness>(exc, HttpStatus.NOT_FOUND);
		
		}
		
		return ResponseEntity.ok().body(categoria);
	}	
	*/

}
