package it.menu.services.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.menu.repositories.CategorieRepository;
import it.menu.repositories.entities.Categorie;
import it.menu.services.CategorieService;
import it.menu.services.constants.ServiceMessages;
import it.menu.services.exceptions.ServiceException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
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
		Categorie categoria = null;

		try {
			categoria = categorieRepository.findByNome(nomeCategoria);
			
        } catch(Exception e) {
			log.error("Exception in ricercaCategorie", e);
			throw new ServiceException(-1, ServiceMessages.ERRORE_GENERICO);
        }
		
		if (categoria == null) {
			throw new ServiceException(-1, ServiceMessages.RECORD_NON_TROVATO);
		}

		return categoria;
    }

	@Override
	public Categorie ricercaCategoria(Integer id) throws ServiceException {
		Categorie categoria = null;

		try {
			categoria = categorieRepository.findById(id).get();
        } catch(NoSuchElementException e) {
			log.error("Exception in ricercaCategorie", e);
			throw new ServiceException(-1, ServiceMessages.RECORD_NON_TROVATO);
        } catch(Exception e) {
			log.error("Exception in ricercaCategorie", e);
			throw new ServiceException(-1, ServiceMessages.ERRORE_GENERICO);
        }

		return categoria;
    }

	@Override
	public List<Categorie> ricercaCategorie() throws ServiceException {
		List<Categorie> categorie = null;

		try {
			categorie = categorieRepository.findAllCategoriesSorted();
        } catch(Exception e) {
			log.error("Exception in ricercaCategorie", e);
			throw new ServiceException(-1, ServiceMessages.ERRORE_GENERICO);
        }

		return categorie;
    }

}
