package com.Jayacha.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Jayacha.app.model.UserIp;

@Repository
public interface FlightRepo extends CrudRepository<UserIp, Long> {

}