package it.menu.controllers.beans.responses;


import it.menu.repositories.entities.Allergeni;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class AllergeniResponse extends GenericResponse {
	
	private Allergeni allergene;
	

}
