package com.develop.realest.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@Getter
@Setter
public class Property {
    @Id
    private long id;
    private Address address;
    private int squareFootage;
    private int bedrooms;
    private int bathrooms;
    private int price;
    private PropertyDetails details;
    private List<String> images;
    private Location location;
    private List<Amenity> nearestAmenities;

    public Property(
            Address address,
            int squareFootage,
            int bedrooms,
            int bathrooms,
            int price,
            PropertyDetails details,
            List<String> images,
            Location location,
            List<Amenity> nearestAmenities
    ) {
        this.address = address;
        this.squareFootage = squareFootage;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.price = price;
        this.details = details;
        this.images = images;
        this.location = location;
        this.nearestAmenities = nearestAmenities;
    }
}
