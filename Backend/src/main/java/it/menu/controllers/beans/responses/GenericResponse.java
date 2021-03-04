package it.menu.controllers.beans.responses;

import it.menu.controllers.beans.Esito;

public class GenericResponse {
	private Esito esito = null;

	public GenericResponse(Esito esito) {
		super();
		this.esito = esito;
	}

	public GenericResponse() {
		// TODO Auto-generated constructor stub
	}

	public Esito getEsito() {
		return esito;
	}

	public void setEsito(Esito esito) {
		this.esito = esito;
	}
	
	
}