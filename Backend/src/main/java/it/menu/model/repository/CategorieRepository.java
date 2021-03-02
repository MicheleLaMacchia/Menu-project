package it.menu.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.menu.model.entity.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

}
