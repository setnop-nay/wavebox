package repository;

	import org.springframework.data.jpa.repository.JpaRepository;

import controller.LoginController;
import entity.LoginEntity;

	public interface LoginRepository extends JpaRepository<LoginEntity, String> {
	    LoginEntity findByCpf(String cpf);

		LoginEntity save(LoginController login);
	}


