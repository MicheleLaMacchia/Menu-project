package it.menu.services.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.menu.repositories.AllergeniRepository;
import it.menu.repositories.entities.Allergeni;
import it.menu.services.AllergeniService;
import it.menu.services.constants.ServiceMessages;
import it.menu.services.exceptions.ServiceException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AllergeniServiceImpl implements AllergeniService{
	
	@Autowired
	private AllergeniRepository allergeniRepository;
	
	@Override
	public Allergeni inserisciAllergene(Allergeni allergene) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Allergeni modificaAllergene(Allergeni allergene) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Allergeni eliminaAllergene(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Allergeni eliminaAllergene(String nomeAllergene) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Allergeni ricercaAllergene(Integer id) throws ServiceException {

		Allergeni allergene = null;
		try {
			allergene = allergeniRepository.findById(id).get();
		} catch (NoSuchElementException nse) {
			log.error("Errore in ricercaAllergene",nse);
			throw new ServiceException(-1, ServiceMessages.RECORD_NON_TROVATO);
		} catch (Exception e) {

			log.error("Errore in ricercaAllergene",e);
			throw new ServiceException(-1, ServiceMessages.ERRORE_GENERICO);
			
		}
		
		return allergene;
	}

	@Override
	public Allergeni ricercaAllergene(String nomeAllergene) throws ServiceException {
		
		Allergeni allergene = null;
		try {
			allergene = allergeniRepository.findByNome(nomeAllergene);
		}  catch (Exception e) {
			log.error("Errore in ricercaAllergene",e);
			throw new ServiceException(-1, ServiceMessages.ERRORE_GENERICO);
		}
		if (allergene == null) {
			throw new ServiceException(-1, ServiceMessages.RECORD_NON_TROVATO);
		}
		
		return allergene;
	}

	@Override
	public List<Allergeni> ricercaAllergeni() throws ServiceException {
		
		List<Allergeni> allergeni = null;
		
		try {
			allergeni = allergeniRepository.findAllSorted();
		} catch ( Exception e) {
			log.error("Errore in ricercaAllergeni",e);
			throw new ServiceException(-1, ServiceMessages.ERRORE_GENERICO);
		}
		
		return allergeni;
	}

}
