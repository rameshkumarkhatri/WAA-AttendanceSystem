package com.cs.attendance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cs.attendance.domain.User;


@Repository
//("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {

	@Query(value = "SELECT * from users u WHERE u.username = ?1 AND u.password = ?2", nativeQuery = true)
	public User login(String userName, String password);
	
	@Query(value = "SELECT * from users u WHERE u.username = ?1 ", nativeQuery = true)
	public User login(String userName);
	
//	@Query("SELECT u from users u")
//	public List<User> getUsers();
}
