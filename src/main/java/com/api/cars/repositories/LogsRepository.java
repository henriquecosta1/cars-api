package com.api.cars.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.api.cars.documents.LogCars;

public interface LogsRepository extends MongoRepository<LogCars, String> {

}
