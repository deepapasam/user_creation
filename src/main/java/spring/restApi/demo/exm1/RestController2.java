package spring.restApi.demo.exm1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController2 {
	@Autowired
	ServiceClass serviceClass;
	
	
	@PostMapping("/create")
	public String createUser(@RequestBody UserClassDto user) {
		
		return serviceClass.createUser(user);
	}
	@GetMapping("/email/{email}/gender/{gender}")
	public UserClass getDataByEmailAndGender(@PathVariable String email,@PathVariable String gender) {
		UserClass user=serviceClass.getDataByEmailAndGender(email,gender);
		return user;
	}
	
	public String msg() {
		
		
		return "hello every one";
	}
	@GetMapping("/nary")
	public String goodBoy() {
		return "narendra";
	}
	
	@GetMapping("/msg")
	public String greet() {
		return"hiii";
	}

}
