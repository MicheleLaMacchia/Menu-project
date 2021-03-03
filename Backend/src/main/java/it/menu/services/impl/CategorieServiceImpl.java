package it.menu.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.menu.repositories.CategorieRepository;
import it.menu.repositories.entities.Categorie;
import it.menu.services.CategorieService;
import it.menu.services.constants.ServiceMessages;
import it.menu.services.exceptions.ServiceException;


@Service
public class CategorieServiceImpl implements CategorieService {

	@Autowired
	private CategorieRepository categorieRepository;

	@Override
	public Categorie inserisciCategoria(Categorie categoria) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie modificaCategoria(Categorie categoria) throws ServiceException {
		// TODO Auto-generated method stub		
		return null;
	}

	@Override
	public Categorie eliminaCategoria(Integer id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie eliminaCategoria(String nomeCategoria) throws ServiceException {
		return null;
	}

	@Override
	public Categorie ricercaCategoria(String nomeCategoria) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie ricercaCategoria(Integer id) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categorie> ricercaCategorie() throws ServiceException {
		List<Categorie> categorie = null;

		try {
			categorie = categorieRepository.findAll();
        } catch(Exception e) {
//			log.error("Exception occurs {}", e);
			throw new ServiceException(-1, ServiceMessages.ERRORE_GENERICO);
        }

		return categorie;
    }

}
