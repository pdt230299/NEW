package mvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
public class Persons {
	
	@Id
	private String ID;
	
	@NotBlank(message = "Title not null")
	private String LastName;
	
	@NotBlank(message = "Author not null")
	private String FirstName;
	
	@NotBlank(message = "Booked not null")
	private int Age;
	
	public Persons() {
		
	}
	
}
