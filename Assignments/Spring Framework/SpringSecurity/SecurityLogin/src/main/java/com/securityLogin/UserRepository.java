package com.securityLogin;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.securityLogin.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUserName(String userName);
	List<User> findAll();
	<S extends User> S save(S user);

	@Query("UPDATE User u SET u.failedAttempt = ?1 WHERE u.userName = ?2")
	@Modifying
	public void updateFailedAttempts(int failAttempts, String userName);

}
