package ifanow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifanow.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

	public User findByuserid(String userid);
}
