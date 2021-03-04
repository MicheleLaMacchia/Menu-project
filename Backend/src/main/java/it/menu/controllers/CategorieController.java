package it.menu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.menu.controllers.beans.Esito;
import it.menu.controllers.beans.responses.CategorieListResponse;
import it.menu.controllers.beans.responses.CategorieResponse;
import it.menu.repositories.entities.Categorie;
import it.menu.services.CategorieService;
import it.menu.services.exceptions.ServiceException;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/categorie")
public class CategorieController extends BaseController {

	@Autowired
	private CategorieService categorieService;

	@RequestMapping(path = "/lista", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody HttpEntity<CategorieListResponse> list(){

		HttpEntity<CategorieListResponse> httpEntity = null;

		CategorieListResponse categorieListResponse = new CategorieListResponse();
		try {
			log.info("START invocation getAll() of controller layer");

			List<Categorie> categorie = categorieService.ricercaCategorie();
		
			
			categorieListResponse.setCategorie(categorie);
			categorieListResponse.setEsito(new Esito());

			httpEntity = new HttpEntity<CategorieListResponse>(categorieListResponse);

			log.info("END invocation getAll() of controller layer");

		} catch(ServiceException e) {
			categorieListResponse.setEsito(new Esito(e.getCode(), e.getMessage(), null));
			httpEntity = new HttpEntity<CategorieListResponse>(categorieListResponse);
		}

		return httpEntity;
	}
	
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody HttpEntity<CategorieResponse> getById(@PathVariable("id") Integer id) {

		HttpEntity<CategorieResponse> httpEntity = null;

		CategorieResponse categorieResponse = new CategorieResponse();

		try {
			log.info("START invocation get() of controller layer");

			Categorie categoria = categorieService.ricercaCategoria(id);

			categorieResponse.setCategoria(categoria);
			categorieResponse.setEsito(new Esito());

			httpEntity = new HttpEntity<CategorieResponse>(categorieResponse);

			log.info("END invocation get() of controller layer");

		} catch(ServiceException e) {
			categorieResponse.setEsito(new Esito(e.getCode(), e.getMessage(), new String[] {String.valueOf(id)}));
			httpEntity = new HttpEntity<CategorieResponse>(categorieResponse);
		}

		return httpEntity;
	}
	
	@RequestMapping(value = "/nome/{nome}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody HttpEntity<CategorieResponse> getByName(@PathVariable("nome") String nome) {

		HttpEntity<CategorieResponse> httpEntity = null;

		CategorieResponse categorieResponse = new CategorieResponse();

		try {
			log.info("START invocation get() of controller layer");

			Categorie categoria = categorieService.ricercaCategoria(nome);

			categorieResponse.setCategoria(categoria);
			categorieResponse.setEsito(new Esito());

			httpEntity = new HttpEntity<CategorieResponse>(categorieResponse);

			log.info("END invocation get() of controller layer");

		} catch(ServiceException e) {
			categorieResponse.setEsito(new Esito(e.getCode(), e.getMessage(), new String[] {nome}));
			httpEntity = new HttpEntity<CategorieResponse>(categorieResponse);
		}

		return httpEntity;
	}
	
}
