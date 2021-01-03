package com.mongo.spring.mongo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.spring.mongo.api.model.Employee;

public interface EmpRepository extends MongoRepository<Employee, Integer> {

}
