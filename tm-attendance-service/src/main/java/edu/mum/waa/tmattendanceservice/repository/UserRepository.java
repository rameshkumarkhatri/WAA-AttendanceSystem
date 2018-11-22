package edu.mum.waa.tmattendanceservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edu.mum.waa.tmattendanceservice.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	User findByUserNameAndPassword(String userName, String password);
	User findByUserName(String userName);

}
