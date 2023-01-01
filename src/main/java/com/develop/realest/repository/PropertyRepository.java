package com.develop.realest.repository;

import com.develop.realest.model.Property;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PropertyRepository extends MongoRepository<Property, String> {

    List<Property> findByRooms(int rooms);
}
