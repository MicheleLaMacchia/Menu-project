package it.menu.services;

import java.util.List;

import it.menu.repositories.entities.Allergeni;
import it.menu.services.exceptions.ServiceException;

public interface AllergeniService {
	
	public Allergeni inserisciAllergene(Allergeni allergene) throws ServiceException;
	public Allergeni modificaAllergene(Allergeni allergene) throws ServiceException;
	public Allergeni eliminaAllergene(Integer id) throws ServiceException;
    public Allergeni eliminaAllergene(String nomeAllergene) throws ServiceException;
    public Allergeni ricercaAllergene(Integer id) throws ServiceException;
    public Allergeni ricercaAllergene(String nomeAllergene) throws ServiceException;
    public List<Allergeni> ricercaAllergeni() throws ServiceException;
}