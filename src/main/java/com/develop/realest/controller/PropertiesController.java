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

    @GetMapping
    public List<Property> fetchAllProperties(){
        return propertyService.getAllProperties();
    }
    @GetMapping("/{id}")
    public Property fetchPropertyById(@PathVariable String id){
        return propertyService.getPropertyById(id);
    }

    @PostMapping
    public Property createProperty(@RequestBody Property property){
        return propertyService.createProperty(property);
    }
    @PutMapping("/{id}")
    public Property updateProperty(@PathVariable String id, @RequestBody Property property){
        return propertyService.updateProperty(id, property);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProperty(@PathVariable String id){
        propertyService.deleteProperty(id);
        return ResponseEntity.noContent().build();
    }


    @GetMapping("/findByRooms")
    public List<Property> findByRooms(@RequestParam int rooms) {
        return propertyService.findByRooms(rooms);
    }

}
