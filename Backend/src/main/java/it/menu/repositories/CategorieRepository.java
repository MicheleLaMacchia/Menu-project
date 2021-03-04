package it.menu.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import it.menu.repositories.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Integer>, CategorieCustomRepository {

	@Query(value = "SELECT c FROM Categorie c ORDER BY c.ordine ASC")
	public List<Categorie> findAllCategoriesSorted();

	public Categorie findByNome(String nome);
}
