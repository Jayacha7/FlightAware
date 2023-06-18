package com.Jayacha.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Jayacha.app.model.User;
import com.Jayacha.app.model.UserIp;

@Repository
public interface userRepo extends CrudRepository<User,Long> {
	User findByEmailIdIgnoreCase(String emailId);

}