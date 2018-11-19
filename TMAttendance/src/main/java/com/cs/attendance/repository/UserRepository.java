package com.cs.attendance.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cs.attendance.domain.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

//	@Query("SELECT u from User u WHERE u.username = ?1 AND u.password = ?2")
//	public User login(String userName, String password);
}
