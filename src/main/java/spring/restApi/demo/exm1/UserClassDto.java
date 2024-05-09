package spring.restApi.demo.exm1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data


public class UserClassDto {
	private int id;
	private String name;
	
	private String email; 
	private String password; 
	private long contact; 
	private String city; 
	private String gender;
	
}
