package it.menu.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import it.menu.repositories.entities.Allergeni;

public interface AllergeniRepository extends JpaRepository<Allergeni, Integer>, AllergeniCustomRepository {
	
	@Query(value = "Select a FROM Allergeni a ORDER BY a.nome ASC")
	public List<Allergeni> findAllSorted();
	
	public Allergeni findByNome(String nome);

}
