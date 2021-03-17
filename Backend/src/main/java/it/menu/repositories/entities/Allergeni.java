package it.menu.repositories.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "allergeni")
public class Allergeni {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome_allergene")
	private String nome;
	
	@Column(name = "descrizione_allergene")
	private String descrizione;
	
	@Column(name = "immagine_allergene")
	@Lob
	private byte[] immagine;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public byte[] getImmagine() {
		return immagine;
	}

	public void setImmagine(byte[] immagine) {
		this.immagine = immagine;
	}

	public Allergeni(Integer id, String nome, String descrizione, byte[] immagine) {
		super();
		this.id = id;
		this.nome = nome;
		this.descrizione = descrizione;
		this.immagine= immagine;
	}
	
	
	

}
