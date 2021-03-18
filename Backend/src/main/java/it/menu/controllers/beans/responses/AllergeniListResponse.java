package it.menu.controllers.beans.responses;

import java.util.List;

import it.menu.repositories.entities.Allergeni;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class AllergeniListResponse extends GenericResponse{

	private List<Allergeni> allergeni;
	
}
