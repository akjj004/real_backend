package com.develop.realest.service;

import com.develop.realest.repository.PropertyRepository;
import com.develop.realest.model.Property;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PropertyService {
    private final PropertyRepository propertyRepository;
    public List<Property> getAllProperties(){
        return propertyRepository.findAll();
    }
}
