package spring.restApi.demo.exm1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestControllerClass {

	@RequestMapping("/add")
	public String addUser(@RequestBody UserClass userClass) {

		// TODO : Service layer

		// Calling Rest Service of another application

		// URL : http://localhost:9999/flipkart/user/create

		// Method : POST

		// Request payload : Yes :

		/*
		 * { "name": "string", "email": "string", "password": "string", "contact": 0,
		 * "gender": "string", "city": "string" }
		 */

		// Create a java class associated to Reques tPayload.

		// Response : String

		/*UserDetails userData = new UserDetails();
		userData.setName("Tim Cook");
		userData.setEmail("Tim@gamil.com");
		userData.setPassword("TimCook");
		userData.setGender("MALE");
		userData.setContact(23828382l);
		userData.setCity("NEW YORK");*/

		// Request Body
		HttpEntity<UserClass> httpEntity = new HttpEntity<UserClass>(userClass);

		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<String> responseEntity = restTemplate.
				
				exchange("http://localhost:9999/abc/create", HttpMethod.POST, httpEntity, String.class);
	//restTemplate.postForEntity("http://localhost:9999/flipkart/user/create", httpEntity, String.class);
		
		String response = responseEntity.getBody();
				
		System.out.println("Response : "+response);
		System.out.println("Status Code : "+responseEntity.getStatusCode());
				
		return response;
	}
	
	
	
	//calling another Service with Query params
	
	
	@RequestMapping("/get/users")
	public ResponseEntity<String>  getUsersInforamtion() {
		
		
		//URL : http://localhost:9999/flipkart/users/info?city=HYD&gender=MALE
		
		// Method : GET
		
		//UriComponentsBuilder.fromUriString(getUsersInforamtion())

		String url = "http://localhost:9999/abc/email/abc@gmail.com/gender/female";
		
		//String url = "http://localhost:9999/abc/email/abc@gmail.com/gender/female";
		//"http://localhost:9999/abc/email/abc@gmail.com/gender/female"
		//TODO : pass values dynamically here , 
//		Map<String, String> values = new HashMap<>();
//		values.put("email", "abc@gmail.com");
//		values.put("gender", "femail");
		
		RestTemplate restTemplate = new RestTemplate();
		//restTemplate.exchange(getUsersInforamtion(), HttpMethod.GET, null, null, null)
	    ResponseEntity<String>  users =  restTemplate.getForEntity(url,String.class);
		
		
	    System.out.println(users);  
		
		
		return users;
	}
}
	
