package spring.restApi.demo.exm1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RepositoryClass extends JpaRepository<UserClass, Integer>{

	//UserClass getDataByEmailAndGender();

	//UserClass getDataByEmailAndGender();

	UserClass getDataByEmailAndGender(String email, String gender);

}
