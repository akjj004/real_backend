package com.develop.realest.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Getter
@Setter
@Document
public class Property {
    @Id
    private String id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public PropertyDetails getDetails() {
        return details;
    }

    public void setDetails(PropertyDetails details) {
        this.details = details;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Amenity> getNearestAmenities() {
        return nearestAmenities;
    }

    public void setNearestAmenities(List<Amenity> nearestAmenities) {
        this.nearestAmenities = nearestAmenities;
    }
}
