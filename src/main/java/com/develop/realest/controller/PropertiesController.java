package com.develop.realest.controller;

import com.develop.realest.model.Property;
import com.develop.realest.service.PropertyService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/properties")
@AllArgsConstructor
public class PropertiesController {
    private final PropertyService propertyService;

    @GetMapping
    public List<Property> fetchAllProperties(){
        return propertyService.getAllProperties();
    }
}
