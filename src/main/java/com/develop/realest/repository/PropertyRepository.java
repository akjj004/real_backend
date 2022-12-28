package com.develop.realest.repository;

import com.develop.realest.model.Property;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PropertyRepository extends MongoRepository<Property, String> {

}
