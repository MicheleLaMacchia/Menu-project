package it.menu.model.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categorie")
public class Categorie {
	
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name="nome")
	private String nome;
	@Column(name="immagine")
	private String immagine;
	@Column(name="ordine")
	private Integer ordine;
	@Column(name="username")
	private String username;
	@Column(name="data_aggiornamento")
	private LocalDateTime dataAggiornamento;
	
	public Categorie(Integer id, String nome, String immagine, Integer ordine, String username,
			LocalDateTime dataAggiornamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.immagine = immagine;
		this.ordine = ordine;
		this.username = username;
		this.dataAggiornamento = dataAggiornamento;
	}
	
	public Categorie() {
		super();
	}
	
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
	public String getImmagine() {
		return immagine;
	}
	public void setImmagine(String immagine) {
		this.immagine = immagine;
	}
	public Integer getOrdine() {
		return ordine;
	}
	public void setOrdine(Integer ordine) {
		this.ordine = ordine;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public LocalDateTime getDataAggiornamento() {
		return dataAggiornamento;
	}
	public void setDataAggiornamento(LocalDateTime dataAggiornamento) {
		this.dataAggiornamento = dataAggiornamento;
	}
	@Override
	public String toString() {
		return "Categorie [id=" + id + ", nome=" + nome + ", immagine=" + immagine + ", ordine=" + ordine
				+ ", username=" + username + ", dataAggiornamento=" + dataAggiornamento + "]";
	}	

}
