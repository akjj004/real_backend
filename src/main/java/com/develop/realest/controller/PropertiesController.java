package com.develop.realest.controller;

import com.develop.realest.model.Property;
import com.develop.realest.service.PropertyService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/properties")
@AllArgsConstructor
public class PropertiesController {
    private final PropertyService propertyService;
    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping
    public List<Property> fetchAllProperties(){
        return propertyService.getAllProperties();
    }
    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/{id}")
    public Property fetchPropertyById(@PathVariable String id){
        return propertyService.getPropertyById(id);
    }
    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping
    public Property createProperty(@RequestBody Property property){
        return propertyService.createProperty(property);
    }
    @CrossOrigin(origins = "http://localhost:8080")
    @PutMapping("/{id}")
    public Property updateProperty(@PathVariable String id, @RequestBody Property property){
        return propertyService.updateProperty(id, property);
    }
    @CrossOrigin(origins = "http://localhost:8080")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProperty(@PathVariable String id){
        propertyService.deleteProperty(id);
        return ResponseEntity.noContent().build();
    }
    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/findBy")
    public List<Property> findBy(
            @RequestParam(value = "location", required = false) Integer location,
            @RequestParam(value = "category", required = false) Integer category,
            @RequestParam(value = "rooms", required = false) Integer rooms,
            @RequestParam(value = "minPrice", required = false) Integer minPrice,
            @RequestParam(value = "maxPrice", required = false) Integer maxPrice,
            @RequestParam(value = "minSquareFootage", required = false) Integer minSquareFootage,
            @RequestParam(value = "maxSquareFootage", required = false) Integer maxSquareFootage
    ) {
        return propertyService.findBy(location, category, rooms, minPrice, maxPrice, minSquareFootage, maxSquareFootage);
    }
}


