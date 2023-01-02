package com.develop.realest.service;

import com.develop.realest.repository.PropertyRepository;
import com.develop.realest.model.Property;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class PropertyService {
    @Autowired
    private final PropertyRepository propertyRepository;
    public List<Property> getAllProperties(){
        return propertyRepository.findAll();
    }

    public Property getPropertyById(String id) {
        return propertyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Property not found with id: " + id));
    }

    public Property createProperty(Property property) {
        return propertyRepository.save(property);
    }

    public Property updateProperty(String id, Property property) {
        Property propertyToUpdate = propertyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Property not found with id: " + id));

        propertyToUpdate.setAddress(property.getAddress());
        propertyToUpdate.setSquareFootage(property.getSquareFootage());
        propertyToUpdate.setBedrooms(property.getBedrooms());
        propertyToUpdate.setBathrooms(property.getBathrooms());
        propertyToUpdate.setPrice(property.getPrice());
        propertyToUpdate.setDetails(property.getDetails());
        propertyToUpdate.setImages(property.getImages());
        propertyToUpdate.setLocation(property.getLocation());
        propertyToUpdate.setNearestAmenities(property.getNearestAmenities());

        Property updatedProperty = propertyRepository.save(propertyToUpdate);
        return updatedProperty;
    }

    public void deleteProperty(String id) {
        Property propertyToDelete = propertyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Property not found with id: " + id));
        propertyRepository.delete(propertyToDelete);
    }


    public List<Property> findBy(Integer location, Integer category, Integer rooms,Integer minPrice, Integer maxPrice, Integer minSquareFootage, Integer maxSquareFootage) {
        List<Property> results = new ArrayList<>();

        // Retrieve all properties from the repository
        List<Property> properties = propertyRepository.findAll();

        // Filter the properties by the provided criteria
        for (Property property : properties) {
            if (location != null && !location.equals(property.getLocation())) {
                continue;
            }
            if (category != null && !category.equals(property.getCategory())) {
                continue;
            }
            if (rooms != null && property.getRooms() != rooms) {
                continue;
            }
            if (minPrice != null && property.getPrice() < minPrice) {
                continue;
            }
            if (maxPrice != null && property.getPrice() > maxPrice) {
                continue;
            }
            if (minSquareFootage != null && property.getSquareFootage() < minSquareFootage) {
                continue;
            }
            if (maxSquareFootage != null && property.getSquareFootage() > maxSquareFootage) {
                continue;
            }
            results.add(property);
        }

        return results;
    }
}
