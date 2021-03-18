package it.menu.repositories.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "allergeni")
public class Allergeni {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "descrizione")
	private String descrizione;
	
	@Column(name = "icona")
	@Lob
	private byte[] immagine;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "data_aggiornamento")
	private LocalDateTime dataAggiornamento;
	
}
