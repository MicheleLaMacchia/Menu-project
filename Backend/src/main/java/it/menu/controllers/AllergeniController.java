package it.menu.controllers;

import java.net.http.HttpResponse;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.menu.controllers.beans.Esito;
import it.menu.controllers.beans.responses.AllergeniListResponse;
import it.menu.repositories.entities.Allergeni;
import it.menu.services.AllergeniService;
import it.menu.services.exceptions.ServiceException;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/allergeni")
public class AllergeniController {

	@Autowired
	private AllergeniService allergeniService;
	
	@RequestMapping(path = "/lista", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody HttpEntity<AllergeniListResponse>list(){
		
		HttpEntity<AllergeniListResponse> httpEntity = null;
		AllergeniListResponse allergeniListResponse = new AllergeniListResponse();
		try {
			log.info("Start invocation of getAll() of controller layer");
			List<Allergeni> allergeni = allergeniService.ricercaAllergeni();
			
			allergeniListResponse.setAllergeni(allergeni);
			allergeniListResponse.setEsito(new Esito());
			
			httpEntity = new HttpEntity<AllergeniListResponse>(allergeniListResponse);
			
			log.info("END invocation of getAll() of controller layer");
			
		} catch (ServiceException se) {
			allergeniListResponse.setEsito(new Esito(se.getCode(), se.getMessage(), null));
			httpEntity = new HttpEntity<AllergeniListResponse>(allergeniListResponse);
		}
		return httpEntity;
	}
}
