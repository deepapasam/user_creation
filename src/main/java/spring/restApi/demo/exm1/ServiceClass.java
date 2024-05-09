package spring.restApi.demo.exm1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ServiceClass {
	@Autowired
	RepositoryClass repositoryClass;
	public String createUser(UserClassDto userclaassDto) {
		
		
		UserClass userClass=new UserClass();
		userClass.setId(userclaassDto.getId());
		userClass.setName(userclaassDto.getName());
		userClass.setCity(userclaassDto.getCity());
		userClass.setContact(userclaassDto.getContact());
		userClass.setEmail(userclaassDto.getEmail());
		userClass.setGender(userclaassDto.getGender());
		userClass.setPassword(userclaassDto.getPassword());
		repositoryClass.save(userClass);
		return "usercreated";
	}
	
	

	public UserClass getDataByEmailAndGender(String email, String gender) {
		// TODO Auto-generated method stub
		return repositoryClass.getDataByEmailAndGender(email,gender);
	}
	
	
}
