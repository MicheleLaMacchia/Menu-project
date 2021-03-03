package it.menu.repositories.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import it.menu.repositories.BaseCustomRepository;


public abstract class BaseRepositoryImpl implements BaseCustomRepository
{
	@PersistenceContext
	protected EntityManager entityManager = null;

	/**
	 * @param entityManager
	 */
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}