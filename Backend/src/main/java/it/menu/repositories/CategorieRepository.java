package it.menu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.menu.repositories.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Integer>, CategorieCustomRepository {

	public Categorie findByNome(String nome);
}
